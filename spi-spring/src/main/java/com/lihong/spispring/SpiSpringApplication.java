package com.lihong.spispring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

@SpringBootApplication
public class SpiSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpiSpringApplication.class, args);

        // 在代码中通过 SpringFactoriesLoader 获取服务实例
        List<MyService> myServices = SpringFactoriesLoader.loadFactories(MyService.class, Thread.currentThread().getContextClassLoader());
        for (MyService service : myServices) {
            service.performAction();
        }

    }

}
