package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String secondName = in.nextLine();
        String anotherName = in.nextLine();

        System.out.println(anotherName);
        System.out.println(secondName.toUpperCase());
        System.out.println(name.toLowerCase());
    }
}
