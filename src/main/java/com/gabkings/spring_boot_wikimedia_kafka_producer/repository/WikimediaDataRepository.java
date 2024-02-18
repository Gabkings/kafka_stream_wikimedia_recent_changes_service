package com.gabkings.spring_boot_wikimedia_kafka_producer.repository;

import com.gabkings.spring_boot_wikimedia_kafka_producer.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepository extends JpaRepository<WikimediaData, Long> {
}
