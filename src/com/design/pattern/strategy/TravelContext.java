package com.design.pattern.strategy;

public class TravelContext {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }


    public void travel() {
        if (strategy != null) {
            strategy.travel();
        }

    }
}
