package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    public static void main(String[] args) {

    }

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");

    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return this.data.getCompany();
        }

        @Override
        public String getCountryName() {
//            String countrieName, countrieName2 = null;
//            countrieName = this.data.getCountryCode();
//            for (String s : countries.values()) {
//                if (s.equals(countrieName))
//                    countrieName2 = countries.get(s);
//            }
            return countries.get(this.data.getCountryCode());
        }

        @Override
        public String getName() {
            return this.data.getContactLastName() + ", " + this.data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String phoneNumber, phoneNumber2 = null;
            phoneNumber = String.valueOf(this.data.getPhoneNumber());
            while (phoneNumber.length() < 10) {
                phoneNumber = 0 + phoneNumber;
            }
            //phoneNumber = "+" + String.valueOf(this.data.getCountryPhoneCode()) + "(" + phoneNumber2.substring(0, 3) + ")" + phoneNumber2.substring(3, 6) + "-" + phoneNumber2.substring(6, 8) + "-" + phoneNumber2.substring(8, 10);
            return String.format(
                    "+%d(%s)%s-%s-%s",
                    data.getCountryPhoneCode(),
                    phoneNumber.substring(0, 3),
                    phoneNumber.substring(3, 6),
                    phoneNumber.substring(6, 8),
                    phoneNumber.substring(8, 10)
            );
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}