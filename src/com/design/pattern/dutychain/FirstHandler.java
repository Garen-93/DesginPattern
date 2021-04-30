package com.design.pattern.dutychain;

public class FirstHandler extends AbstractHandler {

    private int right_money = 100;

    public FirstHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    void handle(Task task) {
        if (task != null) {
            int borrowMoney = task.getBorrow_money();
            if (borrowMoney > right_money) {
                System.out.println("你借" + task.getBorrow_money() + "钱，" + getClass().getSimpleName() + "处理不了，请请求下一级吧");
                if (nextHandler != null) {
                    nextHandler.handle(task);
                } else {
                    System.out.println("无人能处理，你自行爆炸吧");
                }
            } else {
                System.out.println(getClass().getSimpleName() + "批准了");
            }
        }
    }
}
