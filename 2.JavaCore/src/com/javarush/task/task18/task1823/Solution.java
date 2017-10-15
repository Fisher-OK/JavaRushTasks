package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName;

        while (true) {
            fileName = reader.readLine();
            if (!fileName.equals("exit")) {
                new ReadThread(fileName).start();
            } else break;
        }
        reader.close();

    }

    public static class ReadThread extends Thread {
        String filename;


        public ReadThread(String fileName) {
            //implement constructor body
            this.filename = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        //        @Override
//        public void run() {
//            try {
//                FileInputStream file = new FileInputStream(fileName);
//                byte[] buffer = new byte[file.available()];
//                Map<Byte, Integer> map = new HashMap<>();
//                int max = 0;
//                int id = Byte.MIN_VALUE;
//
//                while (file.available() > 0) {
//                    file.read(buffer);
//                }
//
//                for (int i = 0; i < buffer.length; i++) {
//                    if (map.containsKey(buffer[i])) {
//                        map.put(buffer[i], map.get(buffer[i] + 1));
//                    } else map.put(buffer[i], 1);
//                }
//
//
//                for (Map.Entry<Byte, Integer> pair : map.entrySet()) {
//                    if (max < pair.getValue()) {
//                        max = pair.getValue();
//                        id = pair.getKey();
//                    }
//                }
//
//                synchronized (resultMap) {
//                    resultMap.put(fileName, id);
//                }
//
//                file.close();
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        @Override
        public void run() {
            TreeMap<Byte, Integer> map = new TreeMap<>();
            try {
                FileInputStream in = new FileInputStream(filename);
                byte buff[] = new byte[in.available()];
                if (in.available() > 0) {
                    in.read(buff);
                }

                for (int i = 0; i < buff.length; i++) {
                    byte bytes = buff[i];
                    if (map.containsKey(bytes)) {
                        int value = map.get(bytes);
                        value++;
                        map.put(bytes, value);
                    } else {
                        map.put(buff[i], 1);
                    }
                }
                int count = 0;
                int bytes = Byte.MIN_VALUE;
                for (Map.Entry<Byte, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > count) {
                        count = entry.getValue();
                        bytes = entry.getKey();
                    }
                }
                synchronized (resultMap) {
                    resultMap.put(filename, bytes);
                }
                in.close();
            } catch (IOException e) {
            }

        }
    }

}
