package com.ddtech.headfirst.strategy;

public class Context {
    Weapon weapon;

   public Context(Weapon weapon){
        this.weapon=weapon;
    }

    public Weapon getWeapon() { //get方法
        return weapon;
    }

    public void setWeapon(Weapon weapon) { //set方法
        this.weapon = weapon;
    }

    public void gun() {
        weapon.gun();
    }
}
