package com.design.pattern.simplefactory;

public class SimpleFactoryTest {

    public static void main(String[] arg) {

        Factory.toProduce("A").show();
        Factory.toProduce("B").show();
        Factory.toProduce("C").show();


    }

}
