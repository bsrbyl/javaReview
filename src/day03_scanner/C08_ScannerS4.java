package day03_scanner;

import java.util.Scanner;

public class C08_ScannerS4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dikdortgenler prizma için aşagida isteninleri giriniz : ");
        System.out.println("uzunKenar : ");
        int uzunKenar= scan.nextInt();
        System.out.println("kisaKenar : ");
        int kisaKenar= scan.nextInt();
        System.out.println("yükseklik : ");
        int yükseklik= scan.nextInt();
        System.out.println("Prizmanin hacmi : " +(uzunKenar* kisaKenar*yükseklik));
    }
}
