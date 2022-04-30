package replit_full.replit_eng_forwhile.replit;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        //Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
        //
        //1 şeker = 1.7 gr
        //
        //Örnek Çıktı:
        //
        //Yılda 12.41 kg şeker kullanıyor.
        
        Scanner scan= new Scanner(System.in);
        System.out.print("lutfen gunde kac bardak cay ictiginiz yaziniz :");
        int cay=scan.nextInt();
        System.out.print("lutfen bir bardak caya kac kup seker attiginizi yaziniz :");
        int seker=scan.nextInt();
        
        double sonuc=(((cay*seker)*365)*1.7)/100;
        System.out.println("sonuc = " + sonuc);
        
    }
}
