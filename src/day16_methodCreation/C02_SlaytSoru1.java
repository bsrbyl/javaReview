package day16_methodCreation;

import java.util.Scanner;

public class C02_SlaytSoru1 {

    static int rakam = 0;
    static int rakamlarTomlami = 0;

    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın. Bu sayının tek mi çift mi olduğunu sıfırdan
        // büyük mü küçük mü olduğunu, ayrıca ve100den büyükse birler onlar ve yüzler
        // basamağındaki rakamların toplamını 100den küçükse sadece birler basamağını yazdıran üç metot oluşturun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz");
        int sayi = scan.nextInt();
        tekMiCiftMi(sayi);
        negatinMiPozitivMi(sayi);
        buyukMuKucukMu(sayi);
    }

    private static void buyukMuKucukMu(int sayi) {
        if (sayi>=100  ){

            while (sayi>0) {

                rakam = sayi % 10;
                rakamlarTomlami += rakam;
                sayi /= 10;

            }

            System.out.println("girdigimiz sayinin rakamlar toplami : " + rakamlarTomlami);

        }
        else if (sayi<99){

            rakam = sayi%10;

            System.out.println("sayinin birler basamagı : " + rakam);

        }else{
            System.out.println("gecerli bir sayi giriniz");
        }


    }

    private static void negatinMiPozitivMi(int sayi) {
        if (sayi >=0 ){
            System.out.println("Sayi sıfırdan buyuk");
        }else{
            System.out.println("sayi sıfırdan kucuk");
        }


    }

    private static void tekMiCiftMi(int sayi) {
        System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");


    }

}
