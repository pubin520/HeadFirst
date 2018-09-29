package com.ddtech.headfirst.factory;
//机器人
public class RobotFactory implements  Factory {
    @Override
    public HuMan createMan() {
        return new Robot();
    }
}
