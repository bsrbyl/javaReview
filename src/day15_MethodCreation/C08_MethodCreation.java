package day15_MethodCreation;

public class C08_MethodCreation {
    public static void main(String[] args) {


        String isim= "Oguzhan";
        String soyisim= "BALKAYA";
        String kKNo="1234567890123456";

       String gizlenmisIsimSoyisim= isimSoyisimGizle(isim,soyisim);
        System.out.println(gizlenmisIsimSoyisim);


        String gizlenmisKKNo= krediKartiGizle(kKNo);
        System.out.println(gizlenmisKKNo);



    }

    private static String krediKartiGizle(String kKNo) {
        String yeniKKNo= "**** **** **** "+ kKNo.substring(12);
        return yeniKKNo;
    }

    public static String isimSoyisimGizle(String isim, String soyisim) {

        String yeniIsim= isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yeniSoyisim= soyisim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");
        return yeniIsim+" "+yeniSoyisim;

    }
}
