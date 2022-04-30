package replit_full.replit_eng_forwhile.replit_eng;

import java.util.Arrays;

public class Q04_Arrays {
    /*
    Create a custom return type method accepts a name as parameter and prints the name as a char array.

(do not use toCharArray() method)

Input : John

Output :[J, o, h, n]
     */
    public static void main(String[] args) {
           isim();
    }
    public static void isim(){
       String input = "John";
        String arr[]=input.split("");
       System.out.println(Arrays.toString(arr));
}
}
