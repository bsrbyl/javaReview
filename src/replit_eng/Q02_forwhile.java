package replit_eng;

import java.util.Scanner;

public class Q02_forwhile {
    public static void main(String[] args) {
        /*
        Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

Input :

30 and 40

Expected OutPut:

GCD for 30 and 40 = 10

LCM for 30 and 40 = 120
         */
        Scanner scan= new Scanner(System.in);
        System.out.print("lutfen iki sayi giriniz : ");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int min=0;
        int ebob=0;
        int ekok=0;

        if (sayi1<sayi2){
             min=sayi1;
        }else{
            min=sayi2;
        }
        for (int i = 1; i < min; i++) {
            if (sayi1%i==0 &&sayi2%i==0){
                ebob=i;
            }
        }
        System.out.println("ebob : "+ ebob);
        ekok=(sayi1*sayi2)/ebob;
        System.out.println("ekok : "+ekok);



    }
}
