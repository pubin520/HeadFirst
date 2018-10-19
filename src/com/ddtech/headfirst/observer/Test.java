package com.ddtech.headfirst.observer;

public class Test {
    public  static void main(String args[]){
        /**
         * 观察哲模式
         */
        Observer observer=new User("zhangsan");
        ConcreteSubject concreteSubject=new ConcreteSubject();
        concreteSubject.attach(observer);
        concreteSubject.setInfomation("hello");
    }
}
