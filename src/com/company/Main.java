package com.company;

public class Main {

    public static void main(String[] args) {
        int chislo = 657812;
        int [] masiv = new int[6];
        if (chislo>0){
            masiv[0] = chislo % 10;
            chislo=chislo-(chislo % 10);
            System.out.println(chislo % 10);
        } else System.out.println("not found");
        if (chislo>=10){
            masiv[1] = (chislo % 100)/10;
            chislo=chislo-(chislo % 100);
            System.out.println(chislo % 100);
        }
        if (chislo>=100){
            masiv[2] = (chislo % 1000)/100;
            chislo=chislo-(chislo % 1000);
            System.out.println(chislo % 1000);
        }
        if (chislo>=1000){
            masiv[3] = (chislo % 10000)/1000;
            chislo=chislo-(chislo % 10000);
            System.out.println(chislo % 10000);
        }
        if (chislo>=10000) {
            masiv[4] = (chislo % 100000)/10000;
            chislo=chislo-chislo % 100000;
            System.out.println(chislo % 100000);
        }
        if (chislo>=100000) {
            masiv[5] = (chislo % 1000000)/100000;
            chislo=chislo-(chislo % 1000000);
            System.out.println(chislo % 1000000);
        }
        for (int i=0; i<masiv.length; i++) {
            System.out.println("chislo v masive = " + masiv[i]);
        }







    }

}
