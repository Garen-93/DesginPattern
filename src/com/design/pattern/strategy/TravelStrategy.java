package com.design.pattern.strategy;

/**
 * 这样做有一个致命的缺点，一旦出行的方式要增加，
 * 我们就不得不增加新的else if语句，而这违反了面向对象的原则之一，对修改封闭。
 * 而这时候，策略模式则可以完美的解决这一切。
 */
public class TravelStrategy {

    enum Strategy {
        WALK, PLANE, SUBWAY;
    }


    private Strategy strategy;

    public TravelStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void travel() {
        switch (strategy) {
            case WALK:
                print("walk");
                break;
            case PLANE:
                print("plane");
                break;
            case SUBWAY:
                print("subway");
                break;
        }
    }


    public void print(String s) {
        System.out.println("您选择的出行方式：" + s);
    }


    public static void main(String[] arg) {

        TravelStrategy walk = new TravelStrategy(Strategy.WALK);
        walk.travel();

        TravelStrategy plane = new TravelStrategy(Strategy.PLANE);
        plane.travel();

        TravelStrategy subway = new TravelStrategy(Strategy.SUBWAY);
        subway.travel();
    }
}
