package com.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
	
	private static final Logger logger = 
			LoggerFactory.getLogger(KafkaConsumerService.class);
	
	@KafkaListener(topics = "topic1", groupId = "group-id")
	public void consumeMessage(String message) {
		logger.info(String.format("message received -> %s", message));
	}

}
