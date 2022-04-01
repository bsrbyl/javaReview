package studentPractice;

import java.util.Scanner;

public class Q03 {
   /* Username is "admin", Password is "pwd123"
   // kullanıcı adı "admin", Şifre "pwd123"
    Ask user to enter username and password
    //kullanıcıdan bilgilerini isteyin (şifre ve nickname)
    User should see "Enter your username and password" message
    // kullanıcı bunu görmeli)
    If she enters correct credentials he should get "You are in your account!" message
    //eğer doğru girerse hesabınızdasınız desin
    Otherwise, she should see "Enter your username and password" message 3 times
    //değilse, 3 kere doğru girme hakkı olsun)
    After 3 times he should get "Your account is blocked" message
    //3 kere yapamazsa hesabınız kilitlendi desin)

    */
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      String username="admin";
      String password="pwd123";
      int kalanHak=3;
       String user="";
       String pass="";
      do {
          System.out.print("kullanici adini giriniz :");
           user=scanner.next();
          System.out.print("lutfen sifrenizi giriniz : ");
          pass= scanner.next();

          if (username.equals(user)&&password.equals(pass)){
              System.out.println("tebrikler basarili girisi yaptiniz");
              break;
          }
          kalanHak--;
          if (kalanHak>0){
              System.out.println("yanlis girdiniz kalan hakkiniz : "+kalanHak);
          }else if(kalanHak==0){
              System.out.println(" giris hakkiniz tukendi. lutfen daha sonra tekrar deneyiniz");
          }

      }while ((kalanHak>0));





   }
}
