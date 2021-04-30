package com.design.pattern.dutychain;

public class Task {
    private int borrow_money;

    public Task(int borrow_money) {
        this.borrow_money = borrow_money;
    }

    public int getBorrow_money() {
        return borrow_money;
    }

    public void setBorrow_money(int borrow_money) {
        this.borrow_money = borrow_money;
    }
}
