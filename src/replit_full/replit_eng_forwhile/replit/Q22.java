package replit_full.replit_eng_forwhile.replit;

public class Q22 {
    public static void main(String[] args) {
        /*Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

char ch1= 'a' ;

	String name =“John came late"

	Expected Output:


Number of a = 2

         */
        String name ="John came late";
        char ch1= 'a' ;
        int sayac=0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)==ch1){
                sayac++;
            }

        }
        System.out.println("cumlede " +ch1+ " harfi  "+ sayac +" tane var");
    }
}
