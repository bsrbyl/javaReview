package day17_forLoop;

public class C02_MukemmelSayiSorusuyeni {
    public static void main(String[] args) {
         /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

                  *****   0-100 arasindaki mukemmel sayilari yazdir

        */
        int input=0;
         int mukemmelSayi=0;
        int bolenlerToplami=0;

        do {
            for (int j = 1; j < input; j++) {
                if (input % j == 0) {
                    bolenlerToplami += j;
                }

            }
            if (input==bolenlerToplami){
                System.out.print(input + " ");
            }
            input++;
        } while (input >= 100) ;





    }
}
