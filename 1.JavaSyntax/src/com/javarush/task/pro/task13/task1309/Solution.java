package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Max", 3.4);
        grades.put("Andre", 4.5);
        grades.put("Mark", 4.9);
        grades.put("Claus", 4.3);
        grades.put("Alex", 3.0);
    }
}
