package net.javaguides.springbootkafkatutorial.kafka;

import org.apache.juli.logging.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "JavaGuide",groupId = "myGroup")
    public void consume(String message)
    {
        logger.info(String.format("Message Recieved -> %s",message));

    }
}
