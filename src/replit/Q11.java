package replit;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        //Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.
        //
        //Örnek Çıktı:
        //
        //Verilen tamsayının rakamları toplamı 10'dur.

        Scanner scan= new Scanner(System.in);
        System.out.println("3 basamakli bir sayi girin : ");
        int sayi=scan.nextInt();

        int rakam=0;
        int rakamlartoplam=0;
        rakam=sayi%10;
        rakamlartoplam+=rakam;
        sayi=sayi/10;

        rakam=sayi%10;
        rakamlartoplam+=rakam;
        sayi=sayi/10;

        rakam=sayi%10;
        rakamlartoplam+=rakam;

        System.out.println("rakamlar toplami : "+rakamlartoplam);


    }
}
