package dev.elma.kafka_event_producer_rest.services;


import dev.elma.kafka_event_producer_rest.entities.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

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
