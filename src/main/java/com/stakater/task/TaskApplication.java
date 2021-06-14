package com.stakater.task;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TaskApplication {

	private static final String HELLO = "Hello ";

	private static String name;

	public static void main(String[] args) throws Exception {
		if(args.length != 1)
			throw new Exception("No name as argument");
		name = args[0];
		SpringApplication.run(TaskApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean(name="nameArgument")
	public String nameArgument() { return HELLO.concat(name); }
}
