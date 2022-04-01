package studentPractice;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /* Interview Question
Write a Java program to reverse a string.
 // String'i ters çeviren bir Java programı yazın
Use for loop and create a method called
// For loop ve method çağır'ı kullanın
reverseString = (method adı) */

        Scanner scan=new Scanner(System.in);
        System.out.print("bir string metin giriniz : ");
        String str= scan.nextLine();

        terseCevir(str);





    }

    private static String terseCevir(String str) {
        String reverseStr="";
        for (int i = str.length()-1; i >=0; i--) {
            reverseStr+=str.charAt(i);
        }
        System.out.println(reverseStr);

      return reverseStr;
    }
}
