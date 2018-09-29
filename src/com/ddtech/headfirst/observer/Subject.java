package com.ddtech.headfirst.observer;

public interface Subject {
    //添加
    void attach(Observer observer);
    //移除
    void detach(Observer observer);
    //通知
    void notifyObserver();
}
