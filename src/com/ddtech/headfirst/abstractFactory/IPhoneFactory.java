package com.ddtech.headfirst.abstractFactory;
//iphone工厂
public class IPhoneFactory  extends  AbstractFactory {
    @Override
    public Mouse createMouse() {
        return new IPhoneMouse();
    }

    @Override
    public Keybo createKeybo() {
        return new IPhoneKeybo();
    }
}
