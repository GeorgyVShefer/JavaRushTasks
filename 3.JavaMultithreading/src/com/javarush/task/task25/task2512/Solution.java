package com.javarush.task.task25.task2512;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Живем своим умом
*/

public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
       t.interrupt();

       List<String> res = new ArrayList<>();

       while(e != null){
           res.add(0, e.toString());
             e =  e.getCause();
       }
        for (String result : res){
            System.out.println(result);
        }

    }

    public static void main(String[] args) {
    }
}
