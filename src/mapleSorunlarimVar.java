import java.util.ArrayList;
import java.util.Arrays;

public class mapleSorunlarimVar {
    //  hocam baya bi ustune dusundum ama isin icinden cikamadim Sorum su:
    //2 ayri Map a bu listeleri ekledim ancak unvanlari ve id leri key yaptim ama bu listenin icindeki verileri
    //listedeki gibi Ali can norolog seklinde yazdirmak istiyorum  ancak bunu maple bir turlu yapamadim
    //mapin mantigina mi aykiri bilemedim baya bi arastirmaya calistim ama birsey bulamadim
    //oyle bir yontem yoksa bu listeleri obje olarak create edip direk mapa atacagim
    // amacim task te verilen listelerde oynama yapmamakti bu nedenle iki gundur bu soruyla ilgileniyorum
//ex: class1
    ArrayList<String> doktorIsimleri=new ArrayList<>(Arrays.asList("Ali","Ayse","Sevgi","Zeynep","Busra","Nilufer"));
    ArrayList<String> doktorSoyisimleri=new ArrayList<>(Arrays.asList("Can","Yan","Kan","Han","Boyali","Erdem"));
    ArrayList<String> doktorUnvanlari=new ArrayList<>(Arrays.asList("Norolog","Dermatolog","Genel Cerrah","Cocuk Doktoru","Dahiliye","Kardiyolog"));
    ArrayList<String> hastaIsimleri=new ArrayList<>(Arrays.asList("Veli","Fatma","Baris","Aleyna","Nisa","Eda"));
    ArrayList<String> hastaSoyisimleri=new ArrayList<>(Arrays.asList("Tan","Şan","Savas","Tan","Boya","Serdem"));
    ArrayList<String> durumlar=new ArrayList<>(Arrays.asList("Bas agrisi","Alerji","Migren","Soguk Alginligi","Diyabet","Kalp Hastaliklari"));
    ArrayList<String> hastaIdleri=new ArrayList<>(Arrays.asList("100","101","102","103","104","105"));

    ArrayList<ArrayList<String>>hasta=new ArrayList<>(Arrays.asList(hastaIsimleri,hastaSoyisimleri));
    ArrayList<ArrayList<String>>doktor=new ArrayList<>(Arrays.asList(doktorIsimleri,doktorSoyisimleri));

  //ex:class2
//=>>hocam obje olusturup listeyi aliyorum
    //  doktorListesiMap.put(hastane.doktorUnvanlari,hastane.doktor);

    //   System.out.println(hastaListesiMap);
    //   System.out.println(doktorListesiMap);



}
