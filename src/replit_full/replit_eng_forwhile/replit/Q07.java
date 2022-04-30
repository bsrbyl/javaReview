package replit_full.replit_eng_forwhile.replit;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
       // Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
        
        Scanner scan=new Scanner(System.in);
        System.out.print("lutfen bir sayi giriniz : ");
        double sayi=scan.nextInt();
        double sonuc= (sayi*sayi*sayi)/2;
        System.out.println("sonuc = " + sonuc);
        
        
    }
}
