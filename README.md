# Kafka_Spring_Boot_
## 📚Prerequisite
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Apache Kafka](https://img.shields.io/static/v1?style=for-the-badge&message=Apache+Kafka&color=231F20&logo=Apache+Kafka&logoColor=FFFFFF&label=)

# 🌳Project Tree

```
.
├── Kafka_Spring_Boot_.iml
├── README.md
├── kafka_consumer
│   ├── HELP.md
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── dev
│   │   │   │       └── elma
│   │   │   │           └── kafaka_consumer
│   │   │   │               ├── KafakaConsumerApplication.java
│   │   │   │               ├── entities
│   │   │   │               │   └── PageEvent.java
│   │   │   │               └── services
│   │   │   │                   └── KafkaConsumer.java
│   │   │   └── resources
│   │   │       └── application.properties
│   │   └── test
│   │       └── java
│   │           └── dev
│   │               └── elma
│   │                   └── kafaka_consumer
│   │                       └── KafakaConsumerApplicationTests.java
│   └── target
│       ├── classes
│       │   ├── application.properties
│       │   └── dev
│       │       └── elma
│       │           └── kafaka_consumer
│       │               ├── KafakaConsumerApplication.class
│       │               ├── entities
│       │               │   └── PageEvent.class
│       │               └── services
│       │                   └── KafkaConsumer.class
│       └── generated-sources
│           └── annotations
├── kafka_event_producer_rest
│   ├── HELP.md
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── dev
│   │   │   │       └── elma
│   │   │   │           └── kafka_event_producer_rest
│   │   │   │               ├── KafkaEventProducerRestApplication.java
│   │   │   │               ├── api
│   │   │   │               │   └── KafkaEventProducer.java
│   │   │   │               ├── entities
│   │   │   │               │   └── PageEvent.java
│   │   │   │               └── services
│   │   │   │                   └── KafkaConsumer.java
│   │   │   └── resources
│   │   │       └── application.properties
│   │   └── test
│   │       └── java
│   │           └── dev
│   │               └── elma
│   │                   └── kafka_event_producer_rest
│   │                       └── KafkaEventProducerRestApplicationTests.java
│   └── target
│       ├── classes
│       │   ├── application.properties
│       │   └── dev
│       │       └── elma
│       │           └── kafka_event_producer_rest
│       │               ├── KafkaEventProducerRestApplication.class
│       │               ├── api
│       │               │   └── KafkaEventProducer.class
│       │               ├── entities
│       │               │   └── PageEvent.class
│       │               └── services
│       │                   └── KafkaConsumer.class
│       └── generated-sources
│           └── annotations
├── kafka_function_cons_prod
│   ├── HELP.md
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── dev
│   │   │   │       └── elma
│   │   │   │           └── kafka_function_cons_prod
│   │   │   │               ├── KafkaFunctionConsProdApplication.java
│   │   │   │               ├── entities
│   │   │   │               │   └── PageEvent.java
│   │   │   │               └── services
│   │   │   │                   └── FunctionConsProd.java
│   │   │   └── resources
│   │   │       └── application.properties
│   │   └── test
│   │       └── java
│   │           └── dev
│   │               └── elma
│   │                   └── kafka_function_cons_prod
│   │                       └── KafkaFunctionConsProdApplicationTests.java
│   └── target
│       ├── classes
│       │   ├── application.properties
│       │   └── dev
│       │       └── elma
│       │           └── kafka_function_cons_prod
│       │               ├── KafkaFunctionConsProdApplication.class
│       │               ├── entities
│       │               │   └── PageEvent.class
│       │               └── services
│       │                   └── FunctionConsProd.class
│       └── generated-sources
│           └── annotations
├── kafka_stream_function
│   ├── HELP.md
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── dev
│   │   │   │       └── elma
│   │   │   │           └── kafka_stream_function
│   │   │   │               ├── KafkaStreamFunctionApplication.java
│   │   │   │               ├── entities
│   │   │   │               │   └── PageEvent.java
│   │   │   │               └── services
│   │   │   │                   └── StreamFunction.java
│   │   │   └── resources
│   │   │       └── application.properties
│   │   └── test
│   │       └── java
│   │           └── dev
│   │               └── elma
│   │                   └── kafka_stream_function
│   │                       └── KafkaStreamFunctionApplicationTests.java
│   └── target
│       ├── classes
│       │   ├── application.properties
│       │   └── dev
│       │       └── elma
│       │           └── kafka_stream_function
│       │               ├── KafkaStreamFunctionApplication.class
│       │               ├── entities
│       │               │   └── PageEvent.class
│       │               └── services
│       │                   └── StreamFunction.class
│       └── generated-sources
│           └── annotations
└── kafka_supplaier_producer
    ├── HELP.md
    ├── mvnw
    ├── mvnw.cmd
    ├── pom.xml
    ├── src
    │   ├── main
    │   │   ├── java
    │   │   │   └── dev
    │   │   │       └── elma
    │   │   │           └── kafka_supplaier_producer
    │   │   │               ├── KafkaSupplaierProducerApplication.java
    │   │   │               ├── entities
    │   │   │               │   └── PageEvent.java
    │   │   │               └── services
    │   │   │                   └── SupplierProducer.java
    │   │   └── resources
    │   │       └── application.properties
    │   └── test
    │       └── java
    │           └── dev
    │               └── elma
    │                   └── kafka_supplaier_producer
    │                       └── KafkaSupplaierProducerApplicationTests.java
    └── target
        ├── classes
        │   ├── application.properties
        │   └── dev
        │       └── elma
        │           └── kafka_supplaier_producer
        │               ├── KafkaSupplaierProducerApplication.class
        │               ├── entities
        │               │   └── PageEvent.class
        │               └── services
        │                   └── SupplierProducer.class
        └── generated-sources
            └── annotations

123 directories, 69 files

```

## ❕About This Repo

In this repository i will create an application can consume messages from a broker ´KAFKA´  using spring boot and i try to applicate all type of communication between kafka, consumer and producer:

* Communication using:

  *   Kafka Console Consumer
 
  *   Kafka Console Producer
 
* Crete Producer with Spring using:

  * Event Producer with StreamBridge  -> as a Rest api
 
  * Suplier function
 
* Crete Consumer with Spring using:

  * Consumer function

* Crete Consumer/Producer (KafkaStream) with Spring (Stream Processing):

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
* Should to set this parameters in `application.properites` file:
```yml
   spring.cloud.stream.bindings.consumerPageEvent-in-0.destination=test
   spring.cloud.function.definition:consumerPageEvent
```

* Test
  
   <img width="1440" alt="Screen Shot 2023-09-29 at 20 33 13" src="https://github.com/Elma-dev/Kafka_Spring_Boot_/assets/67378945/fa857b06-76fa-4c0b-867c-250b97ede805">
## Create Supplier Producer 
```
Producer Supplier send a message to a topic in brocker cyclic delay in time  .
```

```java
 @Service
 public class SupplierProducer {
     @Bean
     public Supplier<PageEvent> pageEventSupplier(){
         return ()->{
             return new PageEvent(
                     Math.random()>0.5?"P1":"P2",
                     Math.random()>0.5?"U1":"U1",
                     new Date(),
                     new Random(1000).nextInt()
             );
         };
     }
 }
```

Should to add some params in .properties file:

```yml
 spring.cloud.stream.bindings.pageEventSupplier-out-0.destination=test
 spring.cloud.function.definition:pageEventSupplier
 spring.integration.poller.fixed-delay=100
```

* Test

  Data Stream From Supplier
  
  <center><img width="745" alt="Screen Shot 2023-09-30 at 20 17 50" src="https://github.com/Elma-dev/Kafka_Spring_Boot_/assets/67378945/e389f25a-4ccc-421d-9905-54625c95906e"></center>

## Create Function Consumer Producer in Same Time

```
 In this section we need to use Function function to create a method can to get message from topic test
and send it to another one test2
```

```java
 @Service
 public class FunctionConsProd {
     @Bean
     public Function<PageEvent,PageEvent> pageEventFunction(){
         return (input)->{
           input.setName(input.getName()+" page");
           input.setUser(input.getUser()+" user");
           return input;
         };
     }
 }
```
* application.properties
```yaml
 spring.cloud.stream.bindings.pageEventFunction-in-0.destination=test
 spring.cloud.stream.bindings.pageEventFunction-out-0.destination=test2
 spring.cloud.function.definition:pageEventFunction

```

* Test

  <img width="1440" alt="image" src="https://github.com/Elma-dev/Kafka_Spring_Boot_/assets/67378945/1e3d4f27-90eb-4896-925b-e044def7a5f2">

## Stream Processing 
```
 In this part, I will create a function to receive data from some topic, do some analysis operations,
and send the result to another topic. 
```

```java
@Service
public class StreamFunction {
    @Bean
    public Function<KStream<String, PageEvent>,KStream<String,Long>> kStreamFunction(){
        return (input)->{

            KStream<String, Long> map = input
                    .filter((k, v) -> v.getDuration() > 100)
                    .map((k, v) -> new KeyValue<String, Long>(v.getName(), 0L))
                    .groupBy((k, y) -> k, Grouped.with(Serdes.String(), Serdes.Long()))
                    .windowedBy(TimeWindows.of(Duration.ofMillis(500)))
                    .count()
                    .toStream()
                    .map((k, v) -> new KeyValue<>("=> "+k.window()+k.window().startTime()+k.window().endTime(), v));
            return map;

        };
    }
}
```




