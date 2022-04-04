package replit;

import java.util.Scanner;

public class Q02 {
  /*
    Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)


    Input  :1238

    Output :Girilen Numananin Tersi: 8321
   */
  public static void main(String[] args) {

      Scanner scan= new Scanner(System.in);
      System.out.print("lutfen bir sayi giriniz : ");
      int sayi=scan.nextInt();

      String yenisayi=String.valueOf(sayi);
      String tersSayi="";

      for (int i = yenisayi.length()-1; i >=0 ; i--) {
          tersSayi+=yenisayi.charAt(i);
      }
      System.out.println("string hali:" +tersSayi);
      int tersSayiInt= Integer.parseInt(tersSayi);
      System.out.println("int hali: "+ tersSayiInt);
  }
}
