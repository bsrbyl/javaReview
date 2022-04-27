package replit_eng_forwhile;

import java.util.Scanner;

public class Cons2 {
    /*
      Create a student's variables in the main method and
    use this assign variables create a method named Changename,
    student as parameter get the information and change all the information in the method
     and add the new information have it print The line where we call the Rename method
    in the Main method is immediately then reprint student information Create a method named changesurname,
     this method is "lastname" as parameter get the variable. In the method,
      ask the user to enter a new last name and change the old last name (i.e. can).

   Ana yöntemde bir öğrencinin değişkenlerini oluşturun ve bu değişkenleri atamayı kullanın
    Changename adlı bir yöntem oluşturun, parametre olarak öğrenci bilgileri alın ve
    yöntemdeki tüm bilgileri değiştirin ve yeni bilgileri ekleyin yazdırın
    Rename yöntemini çağırdığımız satır Ana yöntem hemen ardından öğrenci bilgilerini yeniden yazdırır
     changeurname adlı bir yöntem oluşturun, parametre değişkeni alırken bu yöntem "lastname" dir.
     Yöntemde, kullanıcıdan yeni bir soyadı girmesini ve eski soyadını değiştirmesini isteyin (yani can).
       */
static Scanner scan= new Scanner(System.in);

    String isim="";
  String soyIsim="";
   int ogrenciNo=0;
    static String soyIsim2="";



    public Cons2(){

   }
    public Cons2(String isim, String soyIsim, int ogrenciNo) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.ogrenciNo = ogrenciNo;
    }

    public String getIsim() {
        return isim;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public String getSoyIsim() {

        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {


           this.soyIsim =soyIsim2;


    }

    public static void main(String[] args) {


        System.out.println("lutfen bilgileri doldurunuz: isim : ,soyisim : ,ogrenci no :");
        Cons2 obj = new Cons2();
      obj.isim=scan.nextLine();
        obj.soyIsim=scan.nextLine();
       obj.ogrenciNo=scan.nextInt();
        Changename();

        System.out.println(obj.toString());
    }


    @Override
    public String toString() {
        return "Cons2{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim2+ '\'' +
                ", ogrenciNo=" + ogrenciNo +
                '}';
    }

    public static String Changename() {

       scan.nextLine();//dummy
        System.out.println("lutfen yeni soyisminizi girin :");

        soyIsim2=scan.nextLine();
        return soyIsim2;
    }
}
