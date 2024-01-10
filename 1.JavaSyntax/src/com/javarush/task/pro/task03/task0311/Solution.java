package com.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        double firstDouble = in.nextDouble();
        double secondDouble = in.nextDouble();
        if(Math.abs(firstDouble - secondDouble) < 0.000001){
        System.out.println("числа равны");
        }
        else{
        System.out.println("числа не равны");
    }
}}
