package com.javarush.task.pro.task12.task1212;

public class Solution {

    public static void main(String[] args) {
        // увеличить массив на в два раза
        int[] three = new int[3];
        iNeedSix(three);

    }
    static void iNeedSix(int[] three){
        int[] six = new int[6];
        for (int i = 0; i < three.length; i++){
            six[i] = three[i];
        }
        three = six;

        for (int i : three){
            System.out.println(i);
        }
    }
}
