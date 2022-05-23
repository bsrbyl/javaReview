package hastaneYonetimi2;


import java.util.HashMap;
import java.util.Map;

public class VeriBankasi2 {
    int count = 106;

    static Map<Integer, Hasta2> hastaListesiMap = new HashMap<>();
    static Map<String, Doktor2> doktorListesiMap = new HashMap<>();

    public static void mapOlusturma() {

        Doktor2 doktor1 = new Doktor2("Norolog", "Ali", "Can");
        Doktor2 doktor2 = new Doktor2("Dermatolog", "Ayse", "Yan");
        Doktor2 doktor3 = new Doktor2("Genel Cerrah", "Sevgi", "Kan");
        Doktor2 doktor4 = new Doktor2("Cocuk Doktoru", "Zeynep", "Han");
        Doktor2 doktor5 = new Doktor2("Dahiliye", "Busra", "Boyali");
        Doktor2 doktor6 = new Doktor2("Kardiyolog", "Nilufer", "Erdem");

        Hasta2 hasta1 = new Hasta2("Veli", "Tan", "");
        Hasta2 hasta2 = new Hasta2("Fatma", "Şan", "");
        Hasta2 hasta3 = new Hasta2("Baris", "Savas", "");
        Hasta2 hasta4 = new Hasta2("Aleyna", "Tan", "");
        Hasta2 hasta5 = new Hasta2("Nisa", "Boya", "");
        Hasta2 hasta6 = new Hasta2("Eda", "Serdem", "");

        hastaListesiMap.put(100, hasta1);
        hastaListesiMap.put(101, hasta2);
        hastaListesiMap.put(102, hasta3);
        hastaListesiMap.put(103, hasta4);
        hastaListesiMap.put(104, hasta5);
        hastaListesiMap.put(105, hasta6);


        doktorListesiMap.put(doktor1.getDoktorUnvan(), doktor1);
        doktorListesiMap.put(doktor2.getDoktorUnvan(), doktor2);
        doktorListesiMap.put(doktor3.getDoktorUnvan(), doktor3);
        doktorListesiMap.put(doktor4.getDoktorUnvan(), doktor4);
        doktorListesiMap.put(doktor5.getDoktorUnvan(), doktor5);
        doktorListesiMap.put(doktor6.getDoktorUnvan(), doktor6);


    }
}
