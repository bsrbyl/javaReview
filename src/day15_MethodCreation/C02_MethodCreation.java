package day15_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println( "lutfen bir kelime giriniz");
        String kelime=scanner.next();
        int harfSayisi=kelime.length();

       if (harfSayisi<3){
           System.out.println("kelime cok kisa");
       } else if (harfSayisi==3) {
           ucHarfiTersineCevir(kelime);
       }else if (harfSayisi==4){
           dortHarfiTersineCevir(kelime);
       }else if (harfSayisi==5){
           besHarfiTersineCevir(kelime);
       }else{
           System.out.println("kelime cok kisa");
       }
    }

    private static void besHarfiTersineCevir(String kelime) {
       String tersKelime=kelime.substring(4)+
                kelime.substring(3,4)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 5");
        System.out.println("kelimenin tersten yazilisi : "+ tersKelime);
    }

    private static void dortHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(3)+
                kelime.substring(2,3)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 4");
        System.out.println("kelimenin tersten yazilisi : "+ tersKelime);
    }

    private static void ucHarfiTersineCevir(String kelime) {
        String tersKelime=kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi : 3");
        System.out.println("kelimenin tersten yazilisi : "+ tersKelime);
    }


}
