package replit;

public class Q04 {
    /*
    Dikdortgenin alanini ve cevresini hesaplayan java kodunu yaziniz.

A=5  B=3
Ipucu: Dikdortgenin Cevresi : 2*(A+B);

Dikdortgenin Alani : A * B ;

Ornek Cikti:

Dikdortgenin Cevresi : 16

Dikdortgenin Alani : 15
     */
    public static void main(String[] args) {

        int a=5;
        int b=3;
        int alan=a*b;
        int cevre=2*(a+b);
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
