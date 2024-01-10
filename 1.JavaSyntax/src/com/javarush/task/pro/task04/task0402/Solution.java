package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String text = " любит меня.";
        while(n < 10){
            System.out.println(name + text);
            n++;
        }

    }
}
