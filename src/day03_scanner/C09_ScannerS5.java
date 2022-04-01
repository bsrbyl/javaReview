package day03_scanner;

import java.util.Scanner;

public class C09_ScannerS5 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi yaziniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi yaziniz");
        String soyisim= scan.nextLine();

        System.out.println("Isim - soyisim : " + isim + " " + soyisim);

    }
}
