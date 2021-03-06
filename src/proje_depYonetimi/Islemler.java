package proje_depYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static Scanner scan = new Scanner(System.in);
    public static int id=100;
    public static List<DepoYonetimi> urunlerListesi = new ArrayList<>();
    public static int raf;

    public static void baslangic(){
        System.out.println("Yapmak istediginiz islemi seciniz :\n"+
                "Urun Tanimlama icin 1\n" +
                "Urun Listeme icin 2\n" +
                "Urun Girisi icin 3\n" +
                "Urunu Rafa koymak icin 4\n" +
                "Urun Cikisi icin 5\n"+
                "Butun islemleri bitirmek icin 0'a basiniz");
        int tercih= scan.nextInt();
        switch (tercih){
            case 1:
                uruntanimlama();
                baslangic();
                break;
            case 2:
                urunListele();
                baslangic();
                break;
            case 3:
                urunGirisi();
                baslangic();
                break;
            case 4:
                urunuRafaKoy();
                baslangic();
                break;
            case 5:
                urunCikisi();
                baslangic();
                break;

            case 0:
                cikis();
                break;

            default:
                System.out.println("Hatali bir giris yaptiniz...");
                baslangic();
                break;
        }

    }

    private static void cikis() {
        System.out.println("Cikis yaptiniz");
    }

    private static void urunCikisi() {
        boolean cikisDogruMu=false;
        urunListele();
        System.out.println("Cikis yapmak istediginiz urunun id'sini giriniz :");
        int cikisId= scan.nextInt();
        for (DepoYonetimi each:urunlerListesi
        ) {
            if (each.id==cikisId){
                System.out.println("Cikilacak urun miktarini giriniz : ");
                int kacMiktar=scan.nextInt();
                if (kacMiktar>0 && kacMiktar<each.miktar){
                    each.miktar-=kacMiktar;
                }else System.out.println(" Yeterli urun olmadigi icin cikis yapilamadi. ");
                cikisDogruMu=true;
                break;
            }
        }
    }

    public static void urunuRafaKoy() {


        boolean rafaKoyduMu=false;
        urunListele();
        System.out.println("Lutfen urun listesinden gecerli bir id giriniz: ");
        int girisId= scan.nextInt();

        for (DepoYonetimi each : urunlerListesi
        ) {
            if (each.id==girisId){
                System.out.println("Urunu koymak istediginiz rafi seciniz ");
                each.raf= scan.nextInt();
                rafaKoyduMu=true;
                urunListele();
                break;
                //}else if (each.id!=girisId){
                //  System.out.println("Urun bulunamadigi icin rafa kaldirilmadi.");
            }
            if (each.id!=girisId){
                System.out.println("Urun bulunamadigi icin rafa kaldirilmadi");
            }
        }


        baslangic();
    }




    public static void urunGirisi() {

        boolean sonuc=false;
        System.out.println("Giris yapmak istediginiz urunun id'sini giriniz :");
        int girisId=scan.nextInt();
        for (DepoYonetimi each : urunlerListesi
        ) {
            if (each.id==girisId){
                System.out.println("Girilecek urun miktarini giriniz : ");
                int kacMiktar=scan.nextInt();
                if (kacMiktar>0){
                    each.miktar+=kacMiktar;

                }else System.out.println("Gecerli bir miktar giriniz. ");
                sonuc=true;
                break;
            }
        }

    }

    public static  void urunListele() {
        System.out.println("id     Urun ??smi     Uretici      Miktari        Birimi     Raf");
        System.out.println("********************************************************************");
        for (int i = 0; i < urunlerListesi.size() ; i++) {
            System.out.printf("%-3d    %-9s     %-9s      %3d           %-7s   Raf%2d  \n",
                    urunlerListesi.get(i).id,urunlerListesi.get(i).urunIsmi,urunlerListesi.get(i).uretici,
                    urunlerListesi.get(i).miktar,urunlerListesi.get(i).birim,urunlerListesi.get(i).raf);
        }
        scan.nextLine();
        System.out.println("********************************************************************");
    }


    public static List<DepoYonetimi>  uruntanimlama() {
        boolean flag = true;

        do {
            System.out.print(" Urun tanimlamak icin ;\n urunun ismi :");
            scan.nextLine();
            String urunAdi = scan.nextLine();

            System.out.print("urunun ureticisi : ");
            String uretici = scan.nextLine();

            System.out.print("urunun birimi : ");
            String birim = scan.nextLine();


            DepoYonetimi obj = new DepoYonetimi(id,urunAdi,uretici,birim,raf);
            urunlerListesi.add(obj);
            id++;
            System.out.println("Urun girisini bitirmek istiyorsaniz 0'a basiniz devam etmek istiyorsaniz 1'e basiniz ");
            int devam=scan.nextInt();
            if (devam==1){
                uruntanimlama();
                break;
            }else if  (devam==0){
                System.out.println("Cikis yaptiniz.");
                break;
            }

        } while (flag == true);

        return urunlerListesi;
    }
}
