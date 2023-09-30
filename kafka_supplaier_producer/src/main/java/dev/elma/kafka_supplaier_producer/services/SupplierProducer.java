package dev.elma.kafka_supplaier_producer.services;

import dev.elma.kafka_supplaier_producer.entities.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;
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
