package com.company;

import java.util.Scanner;

/**
 * Created by vika on 20.05.2017.
 */
public class Test {
    public static void main(String[] args) {
        String[] hundreds = new String[]{"", "thousand ", "million ", "billion"};
        String int_to_string = "";
        double ochislo;
        while (true) {
            System.out.println("Input number:");
            Scanner scanner = new Scanner(System.in);
            String consoleInput = scanner.nextLine();
            try {
                ochislo = Double.parseDouble(consoleInput);
                if (ochislo < 0 || ochislo >= 1000000000) {
                    continue;
                }
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong number");
            }
        }
        int whole_number = (int) ochislo;
        //double edfdf = whole_number;
        double not_whole_number = (int) ((ochislo * 100) - (whole_number * 100));
        int[] chislo = new int[String.valueOf(ochislo).length() / 3 + 1];
        int delitel = 1000, noleuberatel = 1;
        //System.out.println(whole_number);
        //System.out.println(not_whole_number);
        //System.out.println(chislo);
        for (int i = 0; i < chislo.length; i++) {
            chislo[i] = (whole_number % delitel) / noleuberatel;
            whole_number = whole_number - (whole_number % delitel);
            delitel *= 1000;
            noleuberatel *= 1000;
        }
        for (int i = chislo.length - 1; i >= 0; i--) {
            if (chislo[i] == 0) {
                int_to_string = int_to_string + integer_to_text(chislo[i]);
            } else int_to_string = int_to_string + integer_to_text(chislo[i]) + hundreds[i];
        }
        if ((int) ochislo > 0) {

            int_to_string = int_to_string + "dollars ";
        }
        if (not_whole_number > 0) {
            int_to_string = int_to_string + integer_to_text((int) not_whole_number) + "cents";
        }

        System.out.println(int_to_string);
    }

    static String integer_to_text(int a) {
        String[] units = new String[]{"", "one ", "two ", "tree ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
        String[] decimals = new String[]{"", "", "twenty ", "thirty ", "fourty ", "fifty ", "sixty ", "seventy ", " eighty ", "ninety ", "ten ", "eleven ", "twelve ", "thirteen ",
                "fourteen ", "thirteen ", "thirteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};

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
