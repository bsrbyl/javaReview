package day17_forLoop;

public class C03 {
    public static void main(String[] args) {


        int toplam = 0;
        int sayi = 0;
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    toplam += j;
                }
            }
            if (toplam == i) {
                System.out.println("" + i + " sayısı mükemmel sayidir");
            }
            toplam = 0;
        }
    }
}