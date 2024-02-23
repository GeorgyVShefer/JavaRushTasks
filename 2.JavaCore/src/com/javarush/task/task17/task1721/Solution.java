package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws CorruptedDataException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = null;
        String file2 = null;
        try{
            file1 = reader.readLine();
            file2 = reader.readLine();
            BufferedReader br1 = new BufferedReader(new FileReader(file1));
            String in1;
            while ((in1 = br1.readLine()) != null){
                allLines.add(in1);
            }
            br1.close();
            BufferedReader br2 = new BufferedReader(new FileReader(file2));
            String in2;
            while((in2 = br2.readLine()) != null){
                forRemoveLines.add(in2);
            }
            br2.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        new Solution().joinData();
    }

    public void joinData() throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
