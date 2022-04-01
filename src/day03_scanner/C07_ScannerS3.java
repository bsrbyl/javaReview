package day03_scanner;

import java.util.Scanner;

public class C07_ScannerS3 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yaricap giriniz : ");
        int yaricap= scan.nextInt();
        System.out.println("Cemberin cevresi : " + (2*3.14*yaricap));
        System.out.println("Cemberin alani : " + (3.14*yaricap*yaricap));

    }
}
