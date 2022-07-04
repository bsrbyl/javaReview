package Qualifed_Interview.interviewQuestion_day01;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*
 * Kulanicidan alina bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
 * return eden metod yaziniz
 *
 * ornek:  input            output
 *         elma  2           eaea
 *         army  3           ayayay

 * */

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir string giriniz : ");
        String str= scanner.nextLine();
        System.out.print("bir sayi giriniz : ");
        int sayi=scanner.nextInt();
        ilkSonHarf(str, sayi);
        System.out.println( ilkSonHarf(str,sayi));
    }

    private static String ilkSonHarf(String str, int sayi) {
        String ilksonharf= str.substring(0,1)+ str.substring(str.length()-1);
        String istenen="";

        for (int i = 1; i <=sayi ; i++) {
            istenen+=ilksonharf;

        }
       return istenen;
    }
}
