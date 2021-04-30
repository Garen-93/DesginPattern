package com.design.pattern.dutychain;

import java.util.regex.Pattern;

public class TestMain {
    public static void main(String[] args) {
        ThirdHandler thirdHandler = new ThirdHandler(null);
        SecondHandler secondHandler = new SecondHandler(thirdHandler);
        FirstHandler firstHandler = new FirstHandler(secondHandler);

        Task task = new Task(50);
        System.out.println("我借" + task.getBorrow_money() + "块");
        firstHandler.handle(task);
        System.out.println("=============================");
        task.setBorrow_money(200);
        System.out.println("我借" + task.getBorrow_money() + "块");
        firstHandler.handle(task);
        System.out.println("=============================");
        task.setBorrow_money(1001);
        System.out.println("我借" + task.getBorrow_money() + "块");
        firstHandler.handle(task);

    }
}
