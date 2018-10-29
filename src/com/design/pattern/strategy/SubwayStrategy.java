package com.design.pattern.strategy;

public class SubwayStrategy implements Strategy {
    @Override
    public void travel() {
        System.out.println("您选择的出行方式为："+"Subway");
    }
}
