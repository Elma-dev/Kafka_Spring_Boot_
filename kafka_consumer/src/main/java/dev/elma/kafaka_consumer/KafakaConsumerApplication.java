package dev.elma.kafaka_consumer;

import dev.elma.kafaka_consumer.entities.PageEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
public class KafakaConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafakaConsumerApplication.class, args);
    }



}
