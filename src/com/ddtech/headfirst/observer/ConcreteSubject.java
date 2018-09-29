package com.ddtech.headfirst.observer;

import com.ddtech.headfirst.observer.Observer;
import com.ddtech.headfirst.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private String  message;
    List<Observer> observerList=new ArrayList<Observer>();
    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (int i=0;i<observerList.size();i++){
            Observer observer=observerList.get(i);
            observer.update(message);
        }
    }
    public void setInfomation(String s) {
        this.message = s;
        System.out.println("微信服务更新消息： " + s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
