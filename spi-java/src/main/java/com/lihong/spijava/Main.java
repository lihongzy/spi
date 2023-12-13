package com.lihong.spijava;

import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        // 在代码中通过 ServiceLoader 获取服务实例
        ServiceLoader<MyService> serviceLoader = ServiceLoader.load(MyService.class);
        for (MyService service : serviceLoader) {
            service.performAction(); // 调用服务
        }
    }
}
