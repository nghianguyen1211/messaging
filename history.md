# Revision

## Current version
    <dependency>
       <groupId>net.kut3.messaging</groupId>
       <artifactId>kafka-client</artifactId>
       <version>0.2.1</version>
    </dependency>

## v0.2.1
### Fix bugs
##### Reset offet doesn't work on BatchConsumer

## v0.2.0
### Changes
##### Produce a message

    KafkaProducer producer = KafkaProducer.newBuilder("host:port",
                "topic",
                "clientId")
                .build();
        
    producer.produce("key", "value");
        
    producer.close();

##### Consumer a topic

    KafkaConsumer consumer = KafkaConsumer.newBuilder("host:port",
                "groupId",
                "clientId",
                Arrays.asList("topicName"))
                .offsetMode(OffsetMode.EARLIEST)
                .build();
        
    consumer.start(m -> System.out.println(m));