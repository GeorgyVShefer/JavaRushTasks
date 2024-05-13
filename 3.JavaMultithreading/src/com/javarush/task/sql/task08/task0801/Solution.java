package com.javarush.task.sql.task08.task0801;

import java.sql.*;

/* 
Работа с транзакциями
*/

public class Solution {
    static final String URL = "jdbc:mysql://localhost:3306/test";
    static final String USER_NAME = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {
        Connection connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
        Statement statement = connection.createStatement();
        String sql = "UPDATE employee SET salary = salary + 2000 WHERE name = 'Diego';" +
                "UPDATE employee SET salary = salary + 500 WHERE name = 'Amigo'";
        statement.executeQuery(sql);
    }
}
