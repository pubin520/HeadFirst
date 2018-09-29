package com.ddtech.headfirst.factory;

public class Test {
    public static void main(String args[]){

        //工程模式：工厂和产品提取成借口
        Factory factory=new ManFactory();
        HuMan man=factory.createMan();
        man.say();

        factory=new WoManFactory();
        man=factory.createMan();
        man.say();
        //开闭原则，对修改关闭，对扩展开发
        //假设现在有第三种人,机器人
        //创建一个机器人的工程,和机器人的say方法

        factory=new RobotFactory();
        man=factory.createMan();
        man.say();

    }
}
