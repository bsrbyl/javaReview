package replit_full.replit_eng_forwhile;

public class Varargs {
    /*
    Write a return method that accepts more than one integer as
    parameter and prints the sum of integers
    Method name = sum if you call method like that sum(1,2,3)
    output =6 sum(1,2,3,4,5) output =15 sum(1,2) output=3
     */
    public static void main(String[] args) {
        int sayi1=1;
        int sayi2=2;
        int sayi3=3;
        sayilarTopla(sayi1,sayi2,sayi3);

    }

    private static void sayilarTopla(int... sayi) {

        int toplam=0;
        for (int s:sayi
             ) {
            toplam +=s;
        }
        System.out.println(toplam);
    }
}
