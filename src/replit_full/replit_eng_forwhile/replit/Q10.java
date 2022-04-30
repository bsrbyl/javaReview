package replit_full.replit_eng_forwhile.replit;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
     //Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
     Scanner scan= new Scanner(System.in);
     System.out.print(" bir Float değer giriniz : ");
     float sayi=scan.nextFloat();
       short sayi2=(short)sayi;
       System.out.println("sayi2 = " + sayi2);

        //int veri türünün Maximum ve Minimum değerlerini gösteren kodu konsola yazınız.

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.

        System.out.print(" bir double değer giriniz : ");
        double sayi3=scan.nextFloat();
        int sayi4=(int)sayi3;
        System.out.println("sayi4 = " + sayi4);
       



    }
}
