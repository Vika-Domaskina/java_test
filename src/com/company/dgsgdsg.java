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
        text_val = new String[]{"  ", " one ", " two ", " tree ", " four ", " five ", " six ", " seven ", " eight ", " nine ", " ten ", " eleven ", " twelve ", " thirteen ", " fourteen ", " thirteen ", " thirteen ", " sixteen ", " seventeen ", " eighteen ", " nineteen "};
        text_decim = new String[]{" twenty ", " thirty ", " fourty ", " fifty ", " sixty ", " seventy ", " eighty ", " ninety "};
        text_ht = new String[]{" hundred ", " thousand "};
        int chislo = 999999;
        int[] masiv = new int[String.valueOf(chislo).length()];
        int delitel = 10, noleuberatel = 1;
        String[] text = new String[String.valueOf(chislo).length()];
        for (int i = 0; i <= String.valueOf(chislo).length(); i++) {
            masiv[i] = chislo % delitel / noleuberatel;
            System.out.println(chislo % delitel);
            chislo = chislo - (chislo % delitel);
            System.out.println(chislo);
            delitel *= 10;
            noleuberatel *= 10;
        }
        /*for (int i = masiv.length-1; i >=0; i--) {
            System.out.println("chislo v masive = " + masiv[i]);

        }*/
        if (masiv[5] >= 0) {
            int_to_text = int_to_text + text_val[masiv[5]] + text_ht[0];
        }
        if (masiv[4] == 1) {
            switch (masiv[3]) {
                case 0:
                    int_to_text = int_to_text + text_val[10] ;
                    break;
                case 1:
                    int_to_text = int_to_text + text_val[11] ;
                    break;
                case 2:
                    int_to_text = int_to_text + text_val[12] ;
                    break;
                case 3:
                    int_to_text = int_to_text + text_val[13];
                    break;
                case 4:
                    int_to_text = int_to_text + text_val[14] ;
                    break;
                case 5:
                    int_to_text = int_to_text + text_val[15] ;
                    break;
                case 6:
                    int_to_text = int_to_text + text_val[16] ;
                    break;
                case 7:
                    int_to_text = int_to_text + text_val[17] ;
                    break;
                case 8:
                    int_to_text = int_to_text + text_val[18] ;
                    break;
                case 9:
                    int_to_text = int_to_text + text_val[19] ;
                    break;
            }
        } else
            switch (masiv[4]) {
                case 0:
                    int_to_text = int_to_text + " ";
                    break;
                case 2:
                    int_to_text = int_to_text + text_decim[0];
                    break;
                case 3:
                    int_to_text = int_to_text + text_decim[1];
                    break;
                case 4:
                    int_to_text = int_to_text + text_decim[2];
                    break;
                case 5:
                    int_to_text = int_to_text + text_decim[3];
                    break;
                case 6:
                    int_to_text = int_to_text + text_decim[4];
                    break;
                case 7:
                    int_to_text = int_to_text + text_decim[5];
                    break;
                case 8:
                    int_to_text = int_to_text + text_decim[6];
                    break;
                case 9:
                    int_to_text = int_to_text + text_decim[7];
                    break;
            }
        if (masiv[3] >= 0&& masiv[4] != 1 ) {
            int_to_text = int_to_text + text_val[masiv[3]] ;
        }
        if ( masiv[2] >= 0) {
            int_to_text = int_to_text + text_ht[1]+ text_val[masiv[2]] + text_ht[0];
        }
        if (masiv[1] == 1) {
            switch (masiv[0]) {
                case 0:
                    int_to_text = int_to_text + text_val[10];
                    break;
                case 1:
                    int_to_text = int_to_text + text_val[11];
                    break;
                case 2:
                    int_to_text = int_to_text + text_val[12];
                    break;
                case 3:
                    int_to_text = int_to_text + text_val[13];
                    break;
                case 4:
                    int_to_text = int_to_text + text_val[14];
                    break;
                case 5:
                    int_to_text = int_to_text + text_val[15];
                    break;
                case 6:
                    int_to_text = int_to_text + text_val[16];
                    break;
                case 7:
                    int_to_text = int_to_text + text_val[17];
                    break;
                case 8:
                    int_to_text = int_to_text + text_val[18];
                    break;
                case 9:
                    int_to_text = int_to_text + text_val[19];
                    break;
            }
        } else
            switch (masiv[1]) {
                case 0:
                    int_to_text = int_to_text + " ";
                    break;
                case 2:
                    int_to_text = int_to_text + text_decim[0];
                    break;
                case 3:
                    int_to_text = int_to_text + text_decim[1];
                    break;
                case 4:
                    int_to_text = int_to_text + text_decim[2];
                    break;
                case 5:
                    int_to_text = int_to_text + text_decim[3];
                    break;
                case 6:
                    int_to_text = int_to_text + text_decim[4];
                    break;
                case 7:
                    int_to_text = int_to_text + text_decim[5];
                    break;
                case 8:
                    int_to_text = int_to_text + text_decim[6];
                    break;
                case 9:
                    int_to_text = int_to_text + text_decim[7];
                    break;
            }
        if (masiv[1] != 1 && masiv[0] >= 0) {
            int_to_text = int_to_text + text_val[masiv[0]];
        }

        System.out.print(int_to_text);
    }
}
