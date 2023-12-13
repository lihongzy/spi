package com.lihong.myspringbootstartertest;

import com.lihong.myspringbootstarter.Hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MainApplication.class, args);

        Hello hello = applicationContext.getBean(Hello.class);
        hello.hello();
    }
}
