package replit_full.replit_eng_forwhile.replit;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
      //Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.
        //
        //INPUT:
        //
        //Dakika sayısı: 3456789
        //
        //OUTPUT :
        //
        //3456789 dakika yaklaşık 6 yıl 210 gündür

        Scanner scan= new Scanner(System.in);
        System.out.print("dakika giriniz : ");
        int dakika=scan.nextInt();
       int yil = dakika/(60*24*365);
       int gun = (dakika%(60*24*365))/(24*60);
       int saat= (gun%(60*24*365))/(24);
       int dakik=(saat%(60*24*365));
       System.out.println(yil+" yil "+ gun+ " gun "+ saat+ " saat "+ dakik + " dakika ");



    }
}
