package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String file;
        ArrayList<String>  arrayList = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            file = reader.readLine();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = reader.readLine()) != null){
                ;


                System.out.println(new StringBuilder(line).reverse().toString());

            }


        }

    }
}
