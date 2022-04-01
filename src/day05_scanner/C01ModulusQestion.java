package day05_scanner;

import java.util.Scanner;

public class C01ModulusQestion {
    public static void main(String[] args) {
         //soru: kullanıcıdan 4 basamaklı bir tam sayi istein ve rakamlar toplamını bulup yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir tamsayi giriniz ");
        int sayi=scan.nextInt();
        int rakam=0;
        int rakamlarToplami=0;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlarToplami+=rakam;
        sayi/=10;
        System.out.println("rakamlar toplami : " +rakamlarToplami);

    }

}
