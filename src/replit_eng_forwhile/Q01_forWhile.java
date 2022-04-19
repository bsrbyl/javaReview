package replit_eng_forwhile;

import java.util.Scanner;

public class Q01_forWhile {
    public static void main(String[] args) {
        /*
        Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name

e.g:

char ch1= 'a' ;

String name =“John came late"

Expected Output: Number of a = 2
         */
        Scanner scan= new Scanner(System.in);
        System.out.print("lutfen bir cumle girin : ");
        String str= scan.nextLine();
        System.out.print("lutfen bir harf girin :");
        char harf= scan.next().charAt(0);
        int sayac=0;
        for (int i = 0; i <str.length() ; i++) {
            if (harf==(str.charAt(i))){
                sayac++;
            }
        }
        System.out.println("cumlede "+ harf + " harfi = "+ sayac+ "  kez kullanilmis");

    }
}
