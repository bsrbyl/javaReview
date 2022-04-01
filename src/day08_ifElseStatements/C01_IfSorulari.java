package day08_ifElseStatements;

import java.util.Scanner;

public class C01_IfSorulari {
    public static void main(String[] args) {
        // girilen bir karakterin , harf olup olmadigini bulalim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter=scan.next().toUpperCase().charAt(0);

        if ((karakter>= 'A' && karakter<='Z') ||(karakter>='a'&& karakter<='z')){
            System.out.println("girdiginiz karakter bir harftir");
        }else{
            System.out.println("girdiginiz karakter harf degildir");
        }

    }
}
