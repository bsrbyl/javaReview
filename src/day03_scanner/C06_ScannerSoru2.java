package day03_scanner;

import java.util.Scanner;

public class C06_ScannerSoru2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz");
        int kenar=scan.nextInt();
        System.out.println("Karenin cevresi : " + (4*kenar));
        System.out.println("Karenin alani : " + (kenar*kenar));

    }
}
