package com.design.pattern.builder;

public class MainTest {
    public static void main(String[] arg) {


        //Builder Test
        Person person = new Person.Builder()
                .age(10)
                .name("Json")
                .height(170)
                .weight(80)
                .build();

        System.out.println(person.toString());
    }
}
