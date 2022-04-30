package replit_full.replit_eng_forwhile.replit_eng;

import java.util.ArrayList;
import java.util.List;

public class Q05_list {
    public static void main(String[] args) {
/*
Write a program that accepts an integer as input and prints first 10 prime numbers greater than input Check numbers if they are even or not in a return method.

Input : 5

Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
 */

        int input=5;
        List<Integer> asalsayilar=new ArrayList<>();
        int sayac=0;
        while (asalsayilar.size()<=10){
            for (int i = 2; i <=input+1; i++) {
                if ((input+1)%i==0){
                    sayac++;
                }
            }
            if (sayac==1){
                asalsayilar.add(input+1);
            }
            input++;
            sayac=0;
        }
        System.out.println(asalsayilar);

    }
}
