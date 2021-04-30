package com.design.pattern.dutychain.okhttp;


import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Interceptor> list = new ArrayList<>();
        list.add(new FirstInterceptor());
        list.add(new SecondInterceptor());
        list.add(new ThirdInterceptor());

    }
}
