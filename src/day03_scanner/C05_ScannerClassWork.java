package day03_scanner;

import java.util.Scanner;

public class C05_ScannerClassWork {
    public static void main(String[] args) {
        // soru1:

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki tamsayi giriniz");
        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();
        System.out.println("iki sayinin toplami : " + (sayi1+sayi2));
        System.out.println("iki sayinin farki : " + (sayi1-sayi2));
        System.out.println("iki sayinin çarpimi : " +(sayi1*sayi2));


    }
}
