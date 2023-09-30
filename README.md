# Kafka_Spring_Boot_
## 📚Prerequisite
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Apache Kafka](https://img.shields.io/static/v1?style=for-the-badge&message=Apache+Kafka&color=231F20&logo=Apache+Kafka&logoColor=FFFFFF&label=)

## About This Repo

In this repository i will create an application can consume messages from a broker ´KAFKA´  using spring boot and i try to applicate all type of communication between kafka, consumer and producer:

* Communication using:

  *   Kafka Console Consumer
 
  *   Kafka Console Producer
 
* Crete Producer with Spring using:

  * Event Producer with StreamBridge  -> as a Rest api
 
  * Suplier function
 
* Crete Consumer with Spring using:

  * Consumer function

* Crete Consumer/Producer (KafkaStream) with Spring (spring cloud stream):

  * Function function

![image](https://github.com/Elma-dev/Kafka_Spring_Boot_/assets/67378945/e1bc6fb3-6791-4d1c-9a7a-682cc59ef76c)

## Install Kafka Using Homebrew

-> To install Kafka with Hombrew just use this command line:

    $ brew install kafka

## Start Zookeper Server

 You shoulld to be in `/usr/local/bin`
   
    $ zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties
    
## Start Kafka Server

 The server start as default in ` localhost:9092 `
 
    $ kafka-server-start /usr/local/etc/kafka/kafka.properties

## Create Topic 

    $ kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test

## Kafka Consumer & Kafka Producer

 * Create first Consumer and subscribe in test topic
 
       $ kafka-console-consumer --bootstrap-server localhost:9092 --topic test --from-beginning
   
 * Create first Producer and subscribe in test topic
 
       $ kafka-console-producer --broker-list localhost:9092 --topic test
 
 * Test
   
    <img width="1195" alt="image" src="https://github.com/Elma-dev/Kafka_Spring_Boot_/assets/67378945/de35a569-e3d3-42ed-8d38-5ebee6b3f80c">

## Create Producer using StreamBridge
   ```java
    @RestController
    @AllArgsConstructor
    public class KafkaEventProducer {
        public StreamBridge streamBridge;
        @GetMapping("/puplish/{topic}/{name}")
        public PageEvent publich(@PathVariable String topic,@PathVariable  String name){
            PageEvent pageEvent=new PageEvent(name,Math.random()>0.5?"U1":"U2",new Date(),new Random().nextInt(1000));
            streamBridge.send(topic,pageEvent);
            return pageEvent;
        }
    }
   ```
   * Test

     <img width="1440" alt="Screen Shot 2023-09-30 at 18 14 04" src="https://github.com/Elma-dev/Kafka_Spring_Boot_/assets/67378945/a9482387-006c-4904-aa80-686b1ba8e05a">

## Create Consumer using Consumer function
```java
 @Service
 public class KafkaConsumer {
     @Bean
     public Consumer<PageEvent> consumerPageEvent(){
         return (input)->{
             System.out.println("---------------------------");
             System.out.println(input.toString());
             System.out.println("-----------------------------");
         };
     } 
 }
```
