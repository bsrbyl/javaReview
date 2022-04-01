package day03_scanner;

public class C01_VariableClassWork {
    public static void main(String[] args) {

        // soru1: farklii data turunde variable olusturun ve bunları yazdırın
         String konu="java";
        System.out.println(konu);//java
        char ımge='&';
        System.out.println(ımge);// &
        int ılksayi=5;
        System.out.println(ılksayi);// 5
        // soru2:  isim ve soyisim icin iki variable olusturun ve bunlari
        //        isminiz : Mehmet
        //        soyisminiz : Bulutluoz     seklinde yazdirin

        String isiminiz="Busra";
        String soyisminiz="Boyali";
        System.out.println("Isminiz : " + isiminiz);
        System.out.println("Soyisminiz : " + soyisminiz);

        //3- Iki farkli tamsayi data turunde 2 variable olusturun bunlarin toplamini yazdirin
        int sayi1=6;
        double sayi2=9;
        System.out.println(sayi1+sayi2);//15

      // 4- Bir tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazdirin
        short sayi3=4;
        double sayi4=5.5;
        System.out.println(sayi3 + sayi4);//9.5

        // 5 – char data turunde bir variable olusturun ve yazdirin
        char harf='B';
        System.out.println(harf);//B
       // 6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin

        int sayi5=7;
        char harf2='C';
        System.out.println(sayi5 + harf2);//74 harfin ascii degerini alarak işlem yaptı.

        int i01=15, i02=16;
        System.out.println("The Multiplication is " + i01*i02);

    }
}
