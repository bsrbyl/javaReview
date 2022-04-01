package day11_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C01_Length {

    public static void main(String[] args) {
        // Kullanicidan ismini alip basharfini ve son harfini Buyuk harflerle yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ismini giriniz");
        String isim=scan.nextLine();

        System.out.println( "ilk Harf : " + (isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0)));
        System.out.println("Sonr Harf : " + (isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1)));

    }
}
