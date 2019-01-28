package com.ddtech.headfirst.abstractFactory;

//戴尔工厂 生产戴尔的鼠标和键盘
public    class DellFactory extends  AbstractFactory{
    @Override
    public Mouse createMouse() {
        return new DellMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new DellKeybo();
    }
}
