package replit;

import java.util.Scanner;

public class Q18 {
   /* Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.

            INPUT: Ay Numarasi: 2

    Yil :   2016
    OUTPUT : Subat 2016 29 Gundur.

    */
   public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       System.out.print("luften ay numarasi giriniz : ");
       int ayNo=scan.nextInt();
       switch (ayNo){
           case 4:
           case 6:
           case 9:
           case 11:
               System.out.println("girdiginiz ay 30 gun");
               break;
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:

               System.out.println("girdiginiz ay 31 gun");
           case 2:
               System.out.print("ogrenmek istediginiz yili giriniz : ");
               int yil=scan.nextInt();
               if(yil%4==0){
                   System.out.println(" bu yilda subat ayi 29 gundur");
               }else{
                   System.out.println(" bu yilda subat ayi 28 gundur");
               }
       }
   }


}
