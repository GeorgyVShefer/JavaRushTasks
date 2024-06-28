package com.javarush.task.task22.task2209;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //...

        String[] split = null;
        try(BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))){
            while (reader.ready()){
                String str = reader.readLine();
                split = str.split(" ");


            }
        }


        StringBuilder result = getLine(split);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if(Objects.isNull(words) || words.length == 0){
            return new StringBuilder();
        }
        List<StringBuilder> stringBuilderList = new ArrayList<>();
        for (String word : words) {

            StringBuilder builder = new StringBuilder(word);
            List<String> list = new ArrayList<>(Arrays.asList(words));
            list.remove(word);
            int count = 0;
            while (!list.isEmpty()){
                String firstStart = builder.substring(0,1);
                String firstEnd = builder.substring(builder.length() - 1);

                String second = list.get(0);
                String secondStart = second.substring(0,1);
                String secondEnd = second.substring(second.length() - 1);

                if(firstEnd.equalsIgnoreCase(secondStart)){
                    builder.append(" ").append(second);
                    list.remove(0);
                } else if (firstStart.equalsIgnoreCase(secondEnd)) {
                    builder.insert(0,second + " ");
                    list.remove(0);
                }else {
                    list.remove(0);
                    list.add(second);
                    count++;
                    if(count > Math.pow(words.length, 2)){
                        break;
                    }
                }

            }
            stringBuilderList.add(builder);
        }
        return stringBuilderList.stream().max((a,b) -> a.length() - b.length()).get();
    }
}
