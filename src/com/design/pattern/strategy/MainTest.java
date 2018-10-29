package com.design.pattern.strategy;

public class MainTest {
    public static void main(String[] arg) {
        TravelContext travelContext = new TravelContext();

        travelContext.setStrategy(new WalkStrategy());
        travelContext.travel();

        travelContext.setStrategy(new PlaneStrategy());
        travelContext.travel();

        travelContext.setStrategy(new SubwayStrategy());
        travelContext.travel();

        //新增一种出行方式

        travelContext.setStrategy(new BikeStrategy());
        travelContext.travel();


    }
}
