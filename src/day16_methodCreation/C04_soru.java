package day16_methodCreation;

public class C04_soru {


    public static void main(String[] args) {
        /*

               A
              BBB
             CCCCC
            DDDDDDD
           EEEEEEEEE
         */
         int n=6;
        for (int i = 1,p='A'; i <n ; i++,p++) {
            for (int j = i; j <n ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=i ; j++) {
                System.out.println((char)p);

            }
            for (int j = 1; j <i ; j++) {
                System.out.println((char)p);

            }

            System.out.println();

        }







    }
}
