# Kafka_Spring_Boot_
## About This Repo

In this repository i will create an application can consume messages from a broker ´KAFKA´  using spring boot and i try to applicate all type of communication between kafka, consumer and producer:

* Communication using:

  *   Kafka Console Consumer
 
  *   Kafka Console Producer
 
* Crete Producer with Spring using:

  * Event Producer  -> as a Rest api
 
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
    
