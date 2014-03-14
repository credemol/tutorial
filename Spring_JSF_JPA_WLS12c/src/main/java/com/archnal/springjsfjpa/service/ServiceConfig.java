package com.archnal.springjsfjpa.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.archnal.springjsfjpa.service.impl.HelloWorldServiceImpl;

@Configuration
public class ServiceConfig {

	@Bean
	public HelloWorldService helloWorldService() {
		return new HelloWorldServiceImpl();
	}
}
