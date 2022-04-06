package replit;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından oluşan yeni bir String yazdırın

Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

INPUT : Mustafa

OUTPUT : fafafa
         */
        Scanner scan= new Scanner(System.in);
        System.out.print("lutfen bir isim giriniz : ");
        String isim = scan.next();
        String sonuc=isim.substring(isim.length()-2)+isim.substring(isim.length()-2)+isim.substring(isim.length()-2);
        System.out.println(sonuc);




    }
}
