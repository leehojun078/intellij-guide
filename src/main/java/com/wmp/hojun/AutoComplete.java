package com.wmp.hojun;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class AutoComplete {

    public static void main(String[] args) {
        main(args, 1 + 2 + 3 + 4);
    }

    public static void main(String[] args, int ii) {

        Calendar fdsfsdfsdf = new GregorianCalendar(Locale.KOREA);

        fdsfsdfsdf = null;
        fdsfsdfsdf = null;
        System.out.println(ii);
        System.out.println(ii);

    }


    public Integer rename() {
        Integer name = 2;

        System.out.println(name);

        return name;
    }

    public static void add(int k) {
        int sum = k + k + k;

        add2(sum);

        System.out.println(sum);
    }

    private static void add2(int sum) {
        if (sum > 10) {
            System.out.println("wow");
        }
    }
}
