package com.design.pattern.strategy;

public class PlaneStrategy implements Strategy {
    @Override
    public void travel() {
        System.out.println("您选择的出行方式："+"Plane");
    }
}
