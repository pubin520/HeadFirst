package com.ddtech.headfirst.AbstractFactory;

//华硕工厂，生产华硕鼠标和键盘
public    class AsusFactory extends  AbstractFactory {
    @Override
    public Mouse createMouse() {
        return  new AsusMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new AsusKeybo();
    }
}
