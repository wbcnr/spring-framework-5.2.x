package com.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class UserConfig {

	@Bean
	public User user(){
		return new User("001", "tom");
	}
}
