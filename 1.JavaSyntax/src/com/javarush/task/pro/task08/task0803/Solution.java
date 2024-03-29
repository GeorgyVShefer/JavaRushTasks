package com.javarush.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Минимальный элемент массива
*/

public class Solution {

    public static void main(String[] args) {

        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        //напишите тут ваш код
        int min = ints[0];
        for (int i : ints){
            min = Math.min(min, i);
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i < 10; i++){
            array[i] = console.nextInt();
        }
        return array;
    }
}
