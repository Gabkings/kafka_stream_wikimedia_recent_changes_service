package com.gabkings.spring_boot_wikimedia_kafka_producer;

import com.gabkings.spring_boot_wikimedia_kafka_producer.kafka.WikimediaChangesProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWikimediaKafkaProducerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWikimediaKafkaProducerApplication.class, args);
	}

	@Autowired
	private WikimediaChangesProducer wikimediaChangesProducer;

	@Override
	public void run(String... args) throws Exception {
		wikimediaChangesProducer.sendMessage();
	}
}
