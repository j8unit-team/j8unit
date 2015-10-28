package org.j8unit.spring.showcase;

import org.j8unit.spring.showcase.di.Foo;
import org.j8unit.spring.showcase.di.FooBarImpl;
import org.j8unit.spring.showcase.di.FooImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "org.j8unit.spring" })
public class TestContext {

    @Bean(name = "fooImpl")
    public Foo createFooImpl() {
        return new FooImpl();
    }

    @Bean(name = "foobarImpl")
    public Foo createFooBarImpl() {
        return new FooBarImpl();
    }
}
