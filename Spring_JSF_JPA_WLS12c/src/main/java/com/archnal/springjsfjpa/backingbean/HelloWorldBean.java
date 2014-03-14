package com.archnal.springjsfjpa.backingbean;

import javax.faces.component.UIComponent;

import com.archnal.springjsfjpa.service.HelloWorldService;

public class HelloWorldBean {
	private String name;
	
	private HelloWorldService helloWorldService;
	
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	public String getDefaultGreeting() {
		return helloWorldService.getGreeting("World");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setName: " + name);
		this.name = name;
	}

	public String getGreeting() {
		return helloWorldService.getGreeting(name);
	}
}
