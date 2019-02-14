package com.criss.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import ({FeginApiApplication.class})
@SpringBootApplication
public class FeginAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeginAppApplication.class, args);
	}

}

