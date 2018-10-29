package com.design.pattern.observer;

public class MainTest {


    public static void main(String[] arg) {
        //ObServer Test
        WeServer weServer = new WeServer();
        User tom = new User("Tom");
        User jack = new User("Jack");
        User marray = new User("Marray");

        weServer.registerObserver(tom);
        weServer.registerObserver(jack);
        weServer.registerObserver(marray);

        weServer.setMessage("Good Morning");

        System.out.println();
        weServer.removeObserver(jack);
        weServer.setMessage("Good Afternoon");


    }
}
