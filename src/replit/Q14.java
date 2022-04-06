package replit;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        //Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
        //
        //IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
        //
        //BMI 18,5'in altındaysa zayıfsınız
        //
        //BMI 18,5 ile 25 arasında ise kilonuz idealdir
        //
        //BMI 25-30 arasındaysa şişmansınız
        //
        //BMI 30'dan büyük veya eşitse, obez
        //
        //Input:
        //
        //Output:
        //
        //Agirlik : 71
        //
        //Boy : 1,72
        //
        //BMI : 23.99945916711736
        //
        //Zayifsiniz.

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen boyunuzu girin : ");
        double boy=scan.nextDouble();
        System.out.println("lutfen kilonuzu girin : ");
        double kilo=scan.nextDouble();
        double bmi=kilo/boy*boy;

        if (bmi<18.5){
            System.out.println(" zayıfsınız");

        }else if (bmi<25){
            System.out.println("kilonuz ideal ");
        }else if (bmi<30){
            System.out.println(" şişmansınız ");
        }else  if (bmi>=30){
            System.out.println(" obez ");
        }else{
            System.out.println("gecerli bir bilgi giriniz");
        }


    }

}
