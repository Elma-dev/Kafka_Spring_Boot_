package dev.elma.kafka_function_cons_prod.services;

import dev.elma.kafka_function_cons_prod.entities.PageEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Function;
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
