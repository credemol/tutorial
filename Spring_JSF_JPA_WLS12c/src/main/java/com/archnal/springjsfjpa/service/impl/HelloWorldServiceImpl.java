package com.archnal.springjsfjpa.service.impl;

import com.archnal.springjsfjpa.service.HelloWorldService;

public class HelloWorldServiceImpl implements HelloWorldService {

	@Override
	public String getGreeting(String name) {
		return "Hello " + name + "!";
	}

	
}
