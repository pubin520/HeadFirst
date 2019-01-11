package com.ddtech.headfirst.Thread;

/***
 *
 * 描述：
 * 作者： 普斌
 * 日期： 2019/1/11 15:12
 */
public class PoiReadExcel implements ThreadRead {
    @Override
    public void read() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PoiReadExcel  方法。。。");
    }
}
