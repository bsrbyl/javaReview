package lampda_review;

import java.util.Arrays;
import java.util.Scanner;

public class C01_2 {

    static String[] kelime;
    static int r=0;
    static String[] str2=new String[1];
    static String[] str3=new String[1];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz : ");
        String str = scan.next();
        String[] kelimeA=str.split("");

        System.out.println("Bir sayi giriniz : ");
        int sayi =  scan.nextInt();
        kelime =new String[sayi];

        dondurme(kelimeA,sayi);

        System.out.println(Arrays.toString(kelime));

    }
    public static void dondurme(String[] str, int sayi)
    {
        str2[0]=str[str.length-1];
        str3[0]=str[0];
        ekle();
    }
    public static boolean ekle()
    {
        if (r%2==0)
        {
            kelime[r]=Arrays.stream(str3).findFirst().get();
            System.out.println(r);
        }
        else {
            kelime[r] = Arrays.stream(str2).findFirst().get();
            System.out.println(r);
        }
        r++;
        if (r== kelime.length)
        {
            return true;
        }
        else return ekle();
    }

}
