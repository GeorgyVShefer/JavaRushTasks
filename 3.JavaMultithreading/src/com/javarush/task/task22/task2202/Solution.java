package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
    }

    public static String getPartOfString(String string) {
        String[] strings;
        String result;
        try{
            strings = string.split(" ");
            result = String.format("%s %s %s %s", strings[1], strings[2], strings[3], strings[4]);
        }catch (Throwable e){
            throw new TooShortStringException();
        }
        return result;
    }

    public static class TooShortStringException extends RuntimeException {

    }
}
