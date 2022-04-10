package replit_eng;

public class Q05_forWhile {
    public static void main(String[] args) {
        /*
        Print even numbers from 20 to 0 but do not use decrement (i--).

OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
         */
String sonuc ="";
        for (int i =0; i <=20 ; i++) {
            if (i%2==0){
                sonuc=i+" ";
                System.out.print(sonuc+" ");
            }
        }
        for (int i = 0; i <sonuc.length() ; i++) {

        }

    }
}
