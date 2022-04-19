package replit_eng_forwhile;

import java.util.Scanner;

public class Q07 {
    /*
    Write java code checking the number is Perfect number or not.

Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.
Input :6 Output:6 is Perfect Number Input :7 Output:7 is not Perfect Number
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("lutfen bir sayi giriniz : ");
        int input=scan.nextInt();
        int sonuc=0;
        for (int i = 1; i <input ; i++) {
            if (input%i==0){
                sonuc+=i;
            }
        }
        if (sonuc==input){
            System.out.println(input+ "  mukemmmel sayidir");
        }else {
            System.out.println(input+ "  mukemmmel sayi degildir");
        }
    }



}
