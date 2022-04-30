package replit_full.replit_eng_forwhile.replit;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        // isim1 çift sayıda karakter içeriyorsa,

        // ikinci kelimeyi ilk adın ortasına yerleştirin

        // ilk kelime tek sayida karakter iceriyorsa

        // “isim1, isim2 ye eklenemiyor” yazdırın

        // Örneğin:
        // isim1= mehmet
        // isim2= ahmet
        // Yazdır ==> mehahmetmet

        // isim1= memet
        // isim2= ahmet
        // Yazdır ==> isim1, isim2 ye eklenemiyor

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen 2 isim giriniz : ");
        String isim1 = scan.next();
        String isim2 = scan.next();


        System.out.println(isim1.length() % 2 == 0 ?
                isim1.substring(0, isim1.length() / 2) + isim2 + isim1.substring(isim1.length() / 2) : "isim1, isim2 ye eklenemiyor");


    }
}
