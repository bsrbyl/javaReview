package replit_full.replit_eng_forwhile;

public class Q04_forwhileArray {
    public static void main(String[] args) {
        /*
        Write a return method that accepts an integer as input and calculates factorial and prints like output.
        Input : 6

Output: 6!=65432*1=720
         */
        int sayi1=6;
        int fak=1;

        for (int i = 1; i <sayi1 ; i++) {
            fak*=i;

        }
        System.out.println(sayi1 +"! = "+fak);
    }
}
