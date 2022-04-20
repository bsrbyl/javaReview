package replit_eng;

public class Q10 {
    /*

Write a Program to find the sum of natural numbers from 1 to 100.

OUTPUT : Sum of Natural Numbers 5050

*/
    public static void main(String[] args) {
        int toplam=0;
        for (int i =1; i <=100 ; i++) {
            toplam+=i;
        }
        System.out.println(" 1'den 100'e kadar olan doğal sayıların toplamını:"+ toplam);

    }
}
