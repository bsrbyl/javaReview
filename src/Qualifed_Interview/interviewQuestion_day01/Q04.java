package Qualifed_Interview.interviewQuestion_day01;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scanner = new Scanner(System.in);
        String pin ="busra123";
        int girisHakki=3;
        while(true){
            System.out.print("pin kodu giriniz : ");
            String girilenPin = scanner.nextLine();

            if (pin.equals(girilenPin)){
                System.out.println("basarili giris yaptiniz");
                break;
            }else{
                System.out.println("yanlis giris yapitiniz..");
                girisHakki--;
                System.out.println("kalan giris hakkiniz : "+ girisHakki);
            }if (girisHakki==0){
                System.out.println("giris hakkiniz kalmadi.. sim kartiniz bloke oldu");
                break;
            }


        }


    }
}
