package com.javarush.task.pro.task09.task0914;

/* 
Обновление пути
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        int firstIndex = path.indexOf("jdk");
        int lastIndex = path.indexOf('/', firstIndex );
        String newPath = path.substring(firstIndex, lastIndex);
        return path.replaceAll(newPath, jdk);
    }
}
