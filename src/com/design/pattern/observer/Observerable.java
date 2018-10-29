package com.design.pattern.observer;

public interface Observerable {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void updateObserver();
}
