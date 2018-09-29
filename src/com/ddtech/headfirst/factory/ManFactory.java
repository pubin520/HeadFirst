package com.ddtech.headfirst.factory;

public class ManFactory implements  Factory {
    @Override
    public HuMan createMan() {
        return  new Man();
    }
}
