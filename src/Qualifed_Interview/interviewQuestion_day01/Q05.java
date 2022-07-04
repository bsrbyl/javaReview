package Qualifed_Interview.interviewQuestion_day01;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine().toLowerCase();
        //.replaceAll(" ","");

        System.out.println("Lutfen bir harf giriniz");
        String harf=scan.next().toLowerCase().substring(0,1);

        String arr[]=cumle.split("");

        int sayac=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(harf)){
                sayac++;
            }
        }
        System.out.println("Cumlede "+harf+" harfinden "+sayac+" tane var.");



    }
}
