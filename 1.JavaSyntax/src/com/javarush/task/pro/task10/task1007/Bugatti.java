package com.javarush.task.pro.task10.task1007;

/* 
С крышей или без? Вот в чем вопрос
*/

public class Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    //напишите тут ваш код
    public Bugatti(){

    }
    public Bugatti(String color, int year, String body){
        this.color = color;
        this.year = year;
        this.body = body;
    }
    public String getBody(){
        return body;
    }
    public void setBody(String body){
       this.body = body;
    }
}
