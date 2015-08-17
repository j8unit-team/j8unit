package de.informaticum.java8.junit.spring.showcase.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringContext {
	
	@Bean(name="fooImpl")
	public Foo createFooImpl() {
		return new FooImpl();
	}
	
	@Bean(name="foobarImpl")
	public Foo createFooBarImpl() {
		return new FooBarImpl();
	}	
}
