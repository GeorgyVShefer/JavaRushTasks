package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        for(int i = 0; i < 10; i++){
            int countStar = 10 - i;
            for(int j = 0; j <= countStar; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}