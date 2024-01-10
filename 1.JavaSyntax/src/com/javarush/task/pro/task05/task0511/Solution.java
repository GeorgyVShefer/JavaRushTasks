package com.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Создаем двумерный массив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        multiArray = new int[n][];
        for (int i = 0; i < multiArray.length; i++){
            int n1 = console.nextInt();
            multiArray[i] = new int[n1];
            for (int j = 0; j < multiArray[i].length; j++){
                System.out.print("[]");
            }
            System.out.println();
//        }
    }
}}
