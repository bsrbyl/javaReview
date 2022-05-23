package qalifed;

import java.util.Scanner;

public class Q7 {
    //7.	A number is called an Armstrong number if it equals to the sum of the cube of its every digit.
    // For example, 153 is an Armstrong number because of 153= 1 + 125 + 27, which is equal to 1^3+5^3+3^3.
    // You need to write a program to check if the given number is Armstrong number or not

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        String strSayi=scan.next();
        armstrongMethod(strSayi);

    }

    private static void armstrongMethod(String strSayi) {
        String basamak[]=strSayi.split("");
        int toplam=0;
        for (int i = 0; i <basamak.length ; i++) {
            toplam+=Math.pow(Integer.valueOf(basamak[i]), basamak.length);

        }
        if (Integer.valueOf(strSayi)==toplam){
            System.out.println("bu bir armstrong bir sayidir");
        }else  System.out.println("bu bir armstrong bir sayi degildir");
    }
}
