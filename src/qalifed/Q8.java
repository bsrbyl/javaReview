package qalifed;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q8 {
    /*
   Create a list by getting the list elements from user
   If there is duplicated elements remove them from the list
*/
    //kullanicidan alinan verilerle bir liste olusturun ve yinenlenen ogeleri cikartin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> liste=new ArrayList<>();
        System.out.println("lutfen alisveris listesi icin gereken bilgileri giriniz. bitirmek icin 0'a basin ");
        String urun=scan.nextLine();

        while(urun !="0"){

            liste.add(urun);
        }



          duzenliListe(liste);



    }

    private static void duzenliListe(List<String> liste) {
        List<String> tekrarsizList = new ArrayList<>();
        for (int i = 0; i <liste.size() ; i++) {
            if (!tekrarsizList.contains(liste.get(i))){
                tekrarsizList.add(liste.get(i));
            }

        }
        System.out.println(tekrarsizList);


    }


}
