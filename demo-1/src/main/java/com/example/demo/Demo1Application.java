package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		System.out.println("========Demo1Application Start 1xxx ========");
		SpringApplication.run(Demo1Application.class, args);
		System.out.println("========Demo1Application End 1xxx========");
	}

}
