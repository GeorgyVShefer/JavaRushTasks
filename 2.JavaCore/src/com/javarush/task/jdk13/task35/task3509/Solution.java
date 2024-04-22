package com.javarush.task.jdk13.task35.task3509;

import com.javarush.task.jdk13.task35.task3503.ClassForGenerics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/* 
Wildcards для коллекций
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static Double sum(List<? extends Number> list) {
       /* Double result = 0.0;
        for (int i = 0; i < list.size(); i++) {
            Number numb = list.get(i);
            result += numb.doubleValue();
        }
        return result;*/
        return list.stream().mapToDouble(Number::doubleValue).sum();
    }

    public static Double multiply(List<? extends Number> list) {
        /*Double result = 1.0;
        for (int i = 0; i < list.size(); i++) {
            Number numb = list.get(i);
            result *= numb.doubleValue();
        }
        return result;*/
        return list.stream().mapToDouble(Number::doubleValue).reduce(1.0, (a, b) -> a * b);
    }

    public static String concat(List<?> list) {
       /* StringBuilder builder = new StringBuilder();
        for (Object obj : list) {
            builder.append(obj);
        }
        return builder.toString();*/
        return  list.stream().map(d-> String.valueOf(d)).collect(Collectors.joining());
    }

    public static <T> List<T> combine(List<? extends Collection<T>> list) {
       /* List result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Collection collection =  list.get(i);
            result.addAll(collection);
        }
        return result;*/
        return list.stream().flatMap(Collection::stream).collect(Collectors.toList());
    }
}
