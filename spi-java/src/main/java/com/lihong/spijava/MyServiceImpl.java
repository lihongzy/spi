package com.lihong.spijava;

// 服务提供者实现
public class MyServiceImpl implements MyService {
    @Override
    public void performAction() {
        // 具体实现
        System.out.println("在MyServiceImpl中执行操作");
    }
}