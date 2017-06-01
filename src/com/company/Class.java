package com.company;

/**
 * Created by vika on 20.05.2017.
 */
public class Class {
    static String int_to_text = "";
    static String txt = "";
    static String[] val = new String[]{"", " one ", " two", " tree", " four", " five", " six", " seven", " eight", " nine"};
    static String[] decim = new String[]{"", "", " twenty", " thirty", " fourty", " fifty", " sixty", " seventy", " eighty", " ninety", " ten", " eleven", " twelve", " thirteen",
            " fourteen", " thirteen", " thirteen", " sixteen", " seventeen", " eighteen", " nineteen"};
    static String[] ht = new String[]{"", " hundred", " thousand", " million"};
    static int ch = 10000000;
    static int ochislo = ch;
    static int[] chislo = new int[String.valueOf(ochislo).length() / 3+1];
    static int delitel = 1000, noleuberatel = 1;
    static int h = chislo.length;

    public static void main(String[] args) {
        //System.out.println(chislo);
        for (int i = chislo.length - 1; i >= 0; i--) {
            chislo[i] = (ochislo % delitel) / noleuberatel;
            ochislo = ochislo - (ochislo % delitel);
            delitel *= 1000;
            noleuberatel *= 1000;
        }
        for (int i = 0; i <= chislo.length - 1; i++) {
            if (i == chislo.length - 1 ) {
                txt = txt + integer_to_text(chislo[i]);
            } else txt = txt + integer_to_text(chislo[i]) + ht[h];
            //System.out.println(chislo[i]);
            //System.out.println(txt);
            h = h - 1;
        }
        System.out.println(txt);
        System.out.println(10000000%10);
        System.out.println(10000000%100);
        //System.out.println(txt);
    }

    static String integer_to_text(int a) {
        int h;
        int ed = a % 10;
        int dec = ((a % 100) - ed) / 10;
        int sot = (a - dec - ed) / 100;
        if (dec == 1) {
            dec = dec + ed;
            ed = 0;
        }
        if (sot > 0) {
            h = 1;
        } else h = 0;


        return val[sot] + ht[h] + decim[dec] + val[ed];
    }
}
