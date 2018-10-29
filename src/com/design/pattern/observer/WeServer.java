package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeServer implements Observerable {

    private List<Observer> list;
    private String message;

    public WeServer() {
        list = new ArrayList<>();
    }


    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (list.size() > 0) {
            list.remove(o);
        }
    }

    @Override
    public void updateObserver() {
        for (Observer observer : list) {
            observer.update(message);
        }

    }


    public void setMessage(String message) {
        this.message = message;
        updateObserver();
    }
}
