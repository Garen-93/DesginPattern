package com.design.pattern.singleton;

public class MainTest {

    public static void main(String[] arg) {

        //SingleTon Test  两次的hashcode完全一致
        SingleTonPattern.getInstance().getSay();
        SingleTonPattern.getInstance().getSay();

    }
}
