package com.design.pattern.strategy;

public class WalkStrategy implements Strategy {
    @Override
    public void travel() {
        System.out.println("您选择的出行方式："+"Walk");
    }
}
