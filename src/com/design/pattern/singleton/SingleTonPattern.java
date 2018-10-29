package com.design.pattern.singleton;

public class SingleTonPattern {


    private static SingleTonPattern instance;

    private SingleTonPattern() {

    }

    public static SingleTonPattern getInstance() {
        if (instance == null) {
            synchronized (SingleTonPattern.class) {
                if (instance == null) {
                    instance = new SingleTonPattern();
                }
            }
        }
        return instance;
    }


    public void getSay() {
        System.out.println("I'am is SingleTon! hashcode--->" + instance.hashCode());
    }
}
