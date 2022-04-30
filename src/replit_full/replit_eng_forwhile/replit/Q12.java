package replit_full.replit_eng_forwhile.replit;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        //Girilen zamanı saniyeye çeviren bir program yazınız.
        //
        //Örnek Çıktı:
        //
        //1 saat 10 dakika 50 saniye ==>
        //
        //4250 saniye
        
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen saninete cevirmek icin saat - dakika -saniye giriniz");
        int saat=scan.nextInt();
        int dakika=scan.nextInt();
        int saniye=scan.nextInt();
        int toplam=0;
        toplam=saniye+ (dakika*60)+(saat*3600);
        System.out.println("toplam = " + toplam);
        
        
        
    }
}
