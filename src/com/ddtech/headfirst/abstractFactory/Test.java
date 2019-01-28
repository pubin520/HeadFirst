package com.ddtech.headfirst.abstractFactory;

public class Test {

    public static void main(String args[]){
            //华硕工厂
            AbstractFactory asusFactory=new AsusFactory();
            Mouse mouse=asusFactory.createMouse();
            mouse.say();
            Keybo keybo=asusFactory.createKeybo();
            keybo.say();
            //戴尔工厂
            AbstractFactory  dellFactory=new DellFactory();
            Mouse mouse1=dellFactory.createMouse();
            mouse1.say();

            Keybo keybo1=dellFactory.createKeybo();
            keybo1.say();
            //若有其他工厂也要生产鼠标可键盘，如苹果工厂只需创建 IPhoneFactory,IPhoneMouse,IPoneKeybo就可以

            AbstractFactory iphoneFactory=new IPhoneFactory();
            Mouse mouse2=iphoneFactory.createMouse();
            mouse2.say();

            Keybo keybo2=iphoneFactory.createKeybo();
            keybo2.say();
    }
}
