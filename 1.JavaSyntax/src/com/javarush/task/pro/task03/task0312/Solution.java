package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        if(s1.equals(s2)) {
            System.out.println("строки одинаковые");
        }
        //напишите тут ваш код
        else{
        System.out.println("строки разные");
    }
}}
