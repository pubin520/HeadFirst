package com.ddtech.headfirst.factory;

public class WoManFactory  implements  Factory{
    @Override
    public HuMan createMan() {
        return new WoMan();
    }
}
