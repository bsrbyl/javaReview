package replit_full.replit_eng_forwhile.replit_eng;

import java.util.Arrays;

public class Q06_Arrays {
    /*
    Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

Input : {3,2,5,4,1,6}

Output :

min: 1

max: 6
     */
    public static void main(String[] args) {
      int input[] = {3,2,5,4,1,6};
      Arrays.sort(input);
      int min=input[0];
      int max=input[input.length - 1];
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
