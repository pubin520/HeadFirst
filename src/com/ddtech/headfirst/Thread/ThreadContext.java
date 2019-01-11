package com.ddtech.headfirst.Thread;

/***
 *
 * 描述：
 * 作者： 普斌
 * 日期： 2019/1/11 14:53
 */
public class ThreadContext extends Thread{
    private ThreadRead threadRead;
    public ThreadContext(ThreadRead threadRead){
        this.threadRead=threadRead;
    }
    @Override
    public void run() {
        threadRead.read();
    }
}
