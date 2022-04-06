package replit;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
       /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

                Input :

        John White

        1234234534561478

        Output : Name :

        J*** W****

        CCN : **** **** **** 1478

        Ilk Harfler Buyuk harf ile baslamalidir.
        */
        Scanner scan= new Scanner(System.in);
        System.out.print("lutfen isim  : ");
        String isim=scan.next();
        System.out.print("lutfen soyisim  : ");
        String soyisim=scan.next();
        System.out.print("lutfen kredi karti numanizi  girin : ");
        String kkNo=scan.next();
        String gizliIsim=isim.substring(0,1)+isim.substring(1).replaceAll("\\S","*");
        String gizliSoyisim= soyisim.charAt(0)+soyisim.substring(1).replaceAll("\\S","*");
        String gizliKkNo="";
        if (kkNo.length()==16){
            gizliKkNo= "**** **** ****"+kkNo.substring(kkNo.length()-4);
        }else{
            System.out.println("gecersiz kredi kart numarasi- 16 haneli olmali");
        }
        System.out.println(gizliIsim+ " "+ gizliSoyisim+ " " +" \n"+gizliKkNo);





    }
}
