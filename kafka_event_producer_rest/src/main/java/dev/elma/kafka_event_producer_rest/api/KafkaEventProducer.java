package dev.elma.kafka_event_producer_rest.api;

import dev.elma.kafka_event_producer_rest.entities.PageEvent;
import lombok.AllArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

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
