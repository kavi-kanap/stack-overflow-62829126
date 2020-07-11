package com.example.exactmatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.PageRequest;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		DummyEntityRepository repo = context.getBean(DummyEntityRepository.class);
		repo.findAllByItems(Arrays.asList("first", "second"), 2, PageRequest.of(1, 5));
	}
}
