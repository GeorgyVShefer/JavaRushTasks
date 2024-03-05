package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,String> map = new TreeMap<>();
        while(true){
            String string = console.readLine();
            if(string.equals("end"))
                break;
            int t = string.lastIndexOf("t");
            String sub = string.substring(t+1);
            int index = Integer.parseInt(sub);
            map.put(index, string);
        }
        for (String fileName : map.values()) {
            String shortName = fileName.substring(0, fileName.lastIndexOf("."));
            try(BufferedInputStream input = new BufferedInputStream(new FileInputStream(fileName));
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(shortName, true))){
                while (input.available() > 0){
                    output.write(input.read());
                }
            }
        }
    }
}
