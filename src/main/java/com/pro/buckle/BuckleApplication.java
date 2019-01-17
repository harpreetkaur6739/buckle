package com.pro.buckle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan()
public class BuckleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuckleApplication.class, args);

	}

}

