package com.ddtech.headfirst.AbstractFactory;

/**
 * 抽象工厂与工厂模式
 *
 * 抽象工厂：当生产的产品是多个，把不同的产品抽象出来，是针对不同的厂家来生产相同的产品
        产品固定，工厂不固定
 * 工厂模式:当只有一个产品时候，申明一个工厂接口，其他工厂去实现这个接口完成生产不同的产品
 *
 */
public  abstract class AbstractFactory {
        //生产不同的产品
        //鼠标
        public abstract Mouse createMouse();
        //键盘
        public abstract Keybo createKeybo();
}
