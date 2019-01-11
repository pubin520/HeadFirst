package com.ddtech.headfirst.Thread;
/***
 *
 * 描述：
 * 作者： 普斌
 * 日期： 2019/1/11 14:59
 */
public class PoiReadBook implements ThreadRead {
    @Override
    public void read() {
        System.out.println("PoiReadBook  实现方法");
    }
}
