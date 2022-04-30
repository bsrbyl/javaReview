package replit_full.replit_eng_forwhile;

import java.util.Scanner;

public class Cons1 {
    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
     *        kazandigini yazip oyunu bitirin
     *
     * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */

    static int oyuncu=1;
    static int puan1=0;
    static int puan2=0;
    static String kelime="";
    static String ekleme="";
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print(oyuncu+" . oyuncu lutfen bir kelime giriniz : ");

        kelime=scan.next();
        oyuncuDegistir();

        onaysor();

    }

    private static void onaysor() {
        System.out.println("girilen kelime :"+kelime);
        System.out.println(oyuncu+" . oyuncu kelimeyi kabul ediyor musun evet : 1 hayir: 2");
        int onay=scan.nextInt();

        if (onay==1) {
            if (oyuncu==1){
                puan2+=kelime.length();
            }else {
                puan1+=kelime.length();
            }
            oyunaDevamEdecekMi();

        }else{
            oyunuBitir();
        }

    }

    private static void oyunuBitir() {
        System.out.println("***oyun bitti***");
        System.out.print( oyuncu + ". oyuncu  kazandi. ");
    }

    private static void oyunaDevamEdecekMi() {
        System.out.println("oyuna devam etmek istiyor musun ? ");
        System.out.println("evet : 1  \nhayir : 2");
        int devamMi=scan.nextInt();
        if (devamMi==1){
            kelimeEkle();
        }else{
            System.out.println("oyun bitti  \n 1.oyuncu puan: "+puan1 +
                    "\n2.oyuncu puan: "+puan2);
            if (puan1>puan2){
                System.out.println("1. oyuncu kazandi");
            }else if (puan1<puan2){
                System.out.println("2. oyuncu kazandi");
            }else{
                System.out.println("berabere kaldiniz..");
            }
        }
    }

    private static void kelimeEkle() {
        System.out.println("eski kelimeye eklemek icin yeni bir kelime giriniz : ");
        ekleme= scan.next();
        System.out.println("yeni kelimeye basa mi sona mi eklemek istersiniz"+
                "\n basa eklemek icin : 1 \nsona eklemek icin : 2");
        int tercih=scan.nextInt();
        if (tercih==1){
            kelime=ekleme + " " +kelime;

        }else{
            kelime=kelime+ " " +ekleme;
        }
        oyuncuDegistir();
        onaysor();
    }

    private static void oyuncuDegistir() {
        if (oyuncu==1){
            oyuncu=2;
        }else{
            oyuncu=1;
        }

    }
}
