package replit_eng;

import java.util.ArrayList;
import java.util.List;

public class Q03_Array {
    public static void main(String[] args) {
        /*
        Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string.

input : ade1r4d3

output : 8

Hint :
     Use Character.isDigit()
     Integer.valueOf()
         */

        verileninnputtakisayilariToplama();

    }

    private static void verileninnputtakisayilariToplama() {
       String input =" ade1r4d3";
       int toplam=0;
      String stringSayi=input.replaceAll("\\D","");
        String arr[]=stringSayi.split("");
        for (int i = 0; i <arr.length; i++) {
           toplam +=Integer.valueOf(arr[i]);
        }

        System.out.println(toplam);

    }
}
