package com.ddtech.headfirst.observer;
import com.ddtech.comm.observer.observer.ConcreteSubject;
public class Test {
    public  static void main(String args[]){
        Observer observer=new User("zhangsan");
        ConcreteSubject concreteSubject=new ConcreteSubject();
        concreteSubject.attach(observer);
        concreteSubject.setInfomation("hello");
    }
}
