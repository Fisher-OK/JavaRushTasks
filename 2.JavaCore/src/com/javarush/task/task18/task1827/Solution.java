package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        ArrayList<String> list = new ArrayList<>();

        BufferedReader fileRead = new BufferedReader(new FileReader(fileName));

        String s = "";
        int id, idNew;


        if ("-c".equals(args[0])) {
            if (fileName.length() == 0) {
                idNew = 0;
            } else {
                while ((s = fileRead.readLine()) != null) {
                    if (!s.isEmpty())
                        list.add(s);
                }

                fileRead.close();
                id = Integer.parseInt(list.get(list.size() - 1).substring(0, 8).trim());

            idNew = ++id;
        }

            list.add(String.format("%-8d%-30s%-8s%-4s", idNew, args[1], args[2], args[3]));

            BufferedWriter fileWrite = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < list.size(); i++) {
                fileWrite.write(list.get(i));
                fileWrite.newLine();
            }
            fileWrite.close();
        }




//        String id = "";
//        String productName = "";
//        String price = "";
//        String quantity = "";
//        ArrayList<String> list = new ArrayList<>();
//
//        if (true) {
//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            String fileName = reader.readLine();
//            reader.close();
//
//            BufferedReader fileRead = new BufferedReader(new FileReader(fileName));
//            String s = "";
//            int max = 0;
//            while ((s = fileRead.readLine()) != null) {
//                list.add(s);
//                if (!s.isEmpty()) {
//                    int tmp = Integer.parseInt(s.substring(0, 8).trim());
//                    if (max < tmp)
//                        max = tmp;
//                }
//            }
//            fileRead.close();
//
//            int tmpId = ++max;
//            id = String.valueOf(tmpId);
//
//            if (id.length() > 8) {
//                id = id.substring(0, 8).trim();
//            } else if (id.length() < 8) {
//                int l = id.length();
//                for (int i = 0; i < l; i++) {
//                    id += " ";
//                }
//            }
//
////            productName = args[1];
////            price = args[2];
////            quantity = args[3];
//
//            productName = "ddddddddd";
//            price = "13.55";
//            quantity = "99";
//
//            if (productName.length() > 30) {
//                productName = productName.substring(0, 30).trim();
//            } else if (productName.length() < 30) {
//                int l = productName.length();
//                for (int i = 0; i < l; i++) {
//                    productName += " ";
//                }
//            }
//
//            if (price.length() > 8) {
//                price = price.substring(0, 8).trim();
//            } else if (price.length() < 8) {
//                int l = price.length();
//                for (int i = 0; i < l; i++) {
//                    price += " ";
//                }
//            }
//
//            if (quantity.length() > 4) {
//                quantity = quantity.substring(0, 4).trim();
//            } else if (quantity.length() < 4) {
//                int l = quantity.length();
//                for (int i = 0; i < l; i++) {
//                    quantity += " ";
//                }
//            }
//
//            String newResult = id + productName + price + quantity;
//            list.add(newResult);
//            BufferedWriter fileWrite = new BufferedWriter(new FileWriter(fileName,true));
//
//            for (int i = 0; i < list.size(); i++) {
//                fileWrite.write(list.get(i));
//                fileWrite.newLine();
//            }
//
//            fileWrite.close();
//        }
    }
}
