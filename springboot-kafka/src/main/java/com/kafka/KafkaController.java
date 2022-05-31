package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	
	private final KafkaProducerService producer;
	
	@Autowired
	public KafkaController(KafkaProducerService producer) {
		this.producer = producer;
	}
	
	@PostMapping("/publish")
	public void sendMsgToTopic(@RequestParam("message") String message) {
		this.producer.sendMessage(message);
	}

}
