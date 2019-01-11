package com.ddtech.headfirst.build;

/***
 *
 * 描述：
 * 作者： 普斌
 * 日期： 2019/1/11 16:03
 */
public class BuildDemo {
    public static void main(String args[]) {
        //方法链调用
        Person person = new Person.Builder()
                .setCountry(1)
                .setSex("男")
                .create();
        System.out.println(person.toString());
    }

}
