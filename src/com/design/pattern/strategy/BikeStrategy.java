package com.design.pattern.strategy;

public class BikeStrategy implements Strategy {
    @Override
    public void travel() {
        System.out.println("我还有另一种出行方式："+"Bike");
    }
}
