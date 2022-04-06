package replit;

public class Q26 {
    public static void main(String[] args) {
        //100'den 0'a kadar çift sayıları yazdırın, ancak decrement(i--) kullanmayın.
        //
        //OUTPUT : 100 98 96 94 92 … … … … 2 0

        int sayi =100;
        for (int i = sayi; i >=0 ; i--) {
            if (i%2==0) {
                System.out.print(i +" ");
            }
        }

    }
}
