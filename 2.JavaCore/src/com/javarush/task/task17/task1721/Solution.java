package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));

        while ((line = reader.readLine()) != null) {
            allLines.add(line);
        }
        reader.close();

        reader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
        while ((line = reader.readLine()) != null) {
            forRemoveLines.add(line);
        }
        reader.close();

        Solution solution = new Solution();
        solution.joinData();
    }

    public void joinData () throws CorruptedDataException {
        for (int i = 0; i < forRemoveLines.size(); i++) {
            if (allLines.contains(forRemoveLines.get(i))) {
                allLines.remove(forRemoveLines.get(i));
            } else {
                allLines.clear();
                throw new CorruptedDataException();
            }
        }
    }
}
