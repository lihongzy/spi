package com.lihong.myspringbootstarter.autoconfig;

import com.lihong.myspringbootstarter.Hello;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class MyAutoConfiguration {
    @Bean
    public Hello hello() {
        return new Hello();
    }
}
