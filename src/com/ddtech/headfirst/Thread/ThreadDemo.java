package com.ddtech.headfirst.Thread;

import java.util.ArrayList;
import java.util.List;

/***
 *
 * 描述：
 * 作者： 普斌
 * 日期： 2019/1/11 15:13
 */
public class ThreadDemo {
    public static void main(String args[]) {
         //策略模式线程
         List<ThreadRead> list_thread=new ArrayList<>();
         ThreadRead poiReadBook=new PoiReadBook();
         ThreadRead poiReadExcel=new PoiReadExcel();
         list_thread.add(poiReadBook);
         list_thread.add(poiReadExcel);
         for (int i=0;i<list_thread.size();i++) {
             new ThreadContext(list_thread.get(i)).start();
         }

        List<ThreadContext> threadContextList = new ArrayList<>();
        threadContextList.add(new ThreadContext(new PoiReadBook()));
        threadContextList.add(new ThreadContext(new PoiReadExcel()));
        for(ThreadContext threadContext:threadContextList){
            threadContext.start();
        }

    }
}
