package com.design.pattern.observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        say(msg);
    }


    private void say(String msg) {
        System.out.println(name + "-->receive msg-->" + msg);
    }
}
