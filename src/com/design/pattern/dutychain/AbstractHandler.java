package com.design.pattern.dutychain;

public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;
    abstract void handle(Task task);
}
