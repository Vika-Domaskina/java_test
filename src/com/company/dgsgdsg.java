package com.company;

/**
 * Created by vika on 20.05.2017.
 */
public class dgsgdsg {
    public static void main(String[] args) {
        String[] text_val;
        String[] text_decim;
        String[] text_ht;
        String int_to_text = " ";
        text_val = new String[]{"", " one ", " two ", " tree ", " four ", " five ", " six ", " seven ", " eight ", " nine ", " ten ", " eleven ", " twelve ", " thirteen ",
                " fourteen ", " thirteen ", " thirteen ", " sixteen ", " seventeen ", " eighteen ", " nineteen "};
        text_decim = new String[]{"",""," twenty ", " thirty ", " fourty ", " fifty ", " sixty ", " seventy ", " eighty ", " ninety "};
        text_ht = new String[]{" hundred ", " thousand "};
        int ochislo = 123123;
        int chislo = ochislo;
        int[] masiv = new int[]{0,0,0,0,0,0};
        int delitel = 10, noleuberatel = 1;
        String[] text = new String[String.valueOf(chislo).length()];
        for (int i = 0; i <= String.valueOf(chislo).length(); i++) {
            masiv[i] = chislo % delitel / noleuberatel;
            //System.out.println(chislo % delitel);
            chislo = chislo - (chislo % delitel);
            //System.out.println(chislo);
            delitel *= 10;
            noleuberatel *= 10;
        }
        /*for (int i = masiv.length-1; i >=0; i--) {
            System.out.println("chislo v masive = " + masiv[i]);

        }*/
        if (ochislo>99999) {
            int_to_text = int_to_text + text_val[masiv[5]] + text_ht[0];
        }

        if (masiv[4] == 1) {
            int_to_text = int_to_text + text_val[masiv[3]+10];
        } else{
            int_to_text = int_to_text + text_decim[masiv[4]];
            int_to_text = int_to_text + text_val[masiv[3]];
        }
        if (ochislo > 999) int_to_text = int_to_text + text_ht[1] ;
        if (masiv[2]>0) {
            int_to_text = int_to_text  + text_val[masiv[2]] + text_ht[0];
        }
        if (masiv[1] == 1) {
            int_to_text = int_to_text + text_val[masiv[0]+10];
        } else{
            int_to_text = int_to_text + text_decim[masiv[1]];
            int_to_text = int_to_text + text_val[masiv[0]];
        }

        System.out.print(int_to_text);
    }
}
