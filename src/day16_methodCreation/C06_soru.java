package day16_methodCreation;

import java.util.Scanner;

public class C06_soru {
    public static void main(String[] args) {

// Bir metindeki unique karakterleri bulan bir kod yaziniz. Hello ==> Heo

        Scanner scanner = new Scanner(System.in);
        System.out.print("lutfen bir metin giriniz :");
        String str=scanner.next();

        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                System.out.print(str.charAt(i));
            }

        }




    }
}
