package replit_full.replit_eng_forwhile.replit;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        //Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
        //
        //Ornek Cikti :
        //
        //Alan: 9
        //
        //Cevre: 12
        Scanner scan= new Scanner(System.in);
        System.out.print("dikdortgeni 2 kenar uzunlugunu giriniz : ");
        double kenar=scan.nextDouble();
        double kenar2=scan.nextDouble();
        double alan=kenar*kenar2;
        double cevre=(2*kenar)+(2*kenar2);
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


    }
}
