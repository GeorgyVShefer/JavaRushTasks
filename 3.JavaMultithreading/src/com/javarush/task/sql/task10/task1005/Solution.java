package com.javarush.task.sql.task10.task1005;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.javarush.task.sql.task10.task1005.entities.Book;

import java.util.ArrayList;
import java.util.List;

/* 
task1005
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<Book> books = new ArrayList<>();
        Session session = MySessionFactory.getSessionFactory().openSession();
        String hql = "SELECT b FROM Book b JOIN Author a JOIN Publisher p " +
                "WHERE a.fullName = 'Mark Twain' and p.name = ' Фолио'";

        Query query = session.createQuery(hql);

        books = query.list();
        books.forEach(System.out::println);
    }
}