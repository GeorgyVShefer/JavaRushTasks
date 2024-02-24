package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

       try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file1));
       BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))){
           ArrayList<Integer> arrayList = new ArrayList<>();
           while(bufferedReader.ready()){
               arrayList.add(bufferedReader.read());
           }
           for (int i = 1 ; i < arrayList.size(); i+=2){
               bufferedWriter.write(arrayList.get(i));
           }
       }


    }

}
