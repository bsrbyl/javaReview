package replit;

public class Q23 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

Input :30
40

Beklenen Cikti:
Beklenen Cikti:
30 ve 40 icin GCD = 10

30 ve 40 icin LCM = 120
         */
        int sayi1=30;
        int sayi2=40;

        int ebob=0;
        int ekok=0;
        for (int i = 1; i <sayi1; i++) {
            if (sayi1%i==0 && sayi2%i==0 ){
                ebob=i;
            }
        }
        System.out.println("ebob : "+ ebob);

     ekok= (sayi1*sayi2)/ebob;

        System.out.println("ekok : "+ ekok);
    }
}
