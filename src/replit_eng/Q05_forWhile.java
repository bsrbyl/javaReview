package replit_eng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q05_forWhile {
    public static void main(String[] args) {
        /*
        Print even numbers from 20 to 0 but do not use decrement (i--).

OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
         */


    int sayi=20;
    int sonsayi=0;

        int sayac=(sayi/2)+1;

        int[] yenilist= new int[sayac];

        while (sayac>0) {

            for (int i = 0; i <= sayi; i++) {
                if (i % 2 == 0) {

                    yenilist[sayac-1]+=i;
                    sayac--;

                }
            }
            System.out.println(Arrays.toString(yenilist));
        }
        for (int i = 0; i <yenilist.length ; i++) {
            sonsayi=yenilist[i];
            System.out.print(sonsayi+" ");
        }

    }
}
