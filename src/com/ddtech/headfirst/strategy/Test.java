package com.ddtech.headfirst.strategy;

public class Test {
    /**
     * 　策略模式的定义：

     　　　定义一组算法，将每个算法都封装起来，使得它们之间可以相互替换。策略模式让算法独立于调用它的客户端而独立变化。

     　　　大白话：

     　　　我清楚知道自己身上有几把武器（策略），我会根据不同的情况使用不同的武器（根据情况，切换策略）。

     　　　游戏中我分别捡到三把枪：

     　　　1、R1895消音左轮一把；

     　　　2、S12K霰弹枪（五连喷）一把；

     　　　3、AWM狙击步枪一把；

     　　   现在我知道我身上是背有三把枪的，然后我就可以根据敌人与我的距离切换使用合适的枪（根据情况，使用不同的策略）。

     　　　突然发现八百米开外有个敌人，我摸出AWM狙击步枪（有目的的切换武器），

     　　   算好风速，调整好姿势，“彭”，一发入魂，敌人应声倒下。

     　　   接着，又发现左前方有个敌人，我切换到S12K霰弹枪（有目的切换武器，切换策略），悄悄向右前方摸了过去，“突突突”

     　　　五连发，游戏结束。
     *
     *抽象策略(Strategy)：通常由接口或抽象类实现。定义了多个具体策略的公共接口，具体策略类中各种不同的算法以不同的方式实现这个接口；Context使用这些接口调用不同实现的算法。
     　　具体策略(ConcreteStrategy)：实现Strategy接口或继承于抽象类Strategy，封装了具体的算法和行为。
     　　环境类(Contex)：持有一个公共策略接口的引用，直接给客户端调用。
     *
     *
     * @param args
     */

    public static void main(String args[]){
        //FirstGun firstGun=new FirstGun();
        //SecondGun secondGun=new SecondGun();
        //Context context=new Context(firstGun);
       // context.gun();
        try{
            Weapon obj=createObject("com.ddtech.headfirst.strategy.SecondGun");
            Context context=new Context(obj);
            context.gun();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
    private static Weapon createObject(String clazzName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName(clazzName);
        return (Weapon)clazz.newInstance();
    }

}
