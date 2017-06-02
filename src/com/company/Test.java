package com.company;

import java.util.Scanner;

/**
 * Created by vika on 20.05.2017.
 */
public class Test {
    public static void main(String[] args) {
        String[] hundreds = new String[]{"", "thousand ", "million "};
        String int_to_string = "";
        System.out.println("Input number:");
        Scanner scanner = new Scanner(System.in);
        String consoleInput = scanner.nextLine();
        int ochislo = Integer.parseInt(consoleInput);
        int[] chislo = new int[String.valueOf(ochislo).length() / 3 + 1];
        int delitel = 1000, noleuberatel = 1;

        //System.out.println(chislo);
        for (int i = 0; i < chislo.length; i++) {
            chislo[i] = (ochislo % delitel) / noleuberatel;
            ochislo = ochislo - (ochislo % delitel);
            delitel *= 1000;
            noleuberatel *= 1000;
        }
        for (int i = chislo.length - 1; i >= 0; i--) {
            if (chislo[i] == 0) {
                int_to_string = int_to_string + integer_to_text(chislo[i]);
            } else int_to_string = int_to_string + integer_to_text(chislo[i]) + hundreds[i];
        }
        System.out.println(int_to_string);
    }

    static String integer_to_text(int a) {
        String[] units = new String[]{"", "one ", "two ", "tree ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
        String[] decimals = new String[]{"", "", "twenty ", "thirty ", "fourty ", "fifty ", "sixty ", "seventy ", " eighty ", "ninety ", "ten ", "eleven ", "twelve ", "thirteen ",
                "fourteen ", "thirteen ", "thirteen ", "sixteen " , "seventeen ", "eighteen ", "nineteen "};

        int ed = a % 10;
        int dec = ((a % 100) - ed) / 10;
        int sot = (a - dec - ed) / 100;
        if (dec == 1) {
            dec = (dec * 10) + ed;
            ed = 0;
        }
        if (sot > 0) {
            return units[sot] + "hundred " + decimals[dec] + units[ed];
        } else return units[sot] + decimals[dec] + units[ed];

    }
}
