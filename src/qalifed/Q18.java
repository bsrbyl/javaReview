package qalifed;

public class Q18 {
    /*
	18.soru
	 Ask user to enter the number of lines of a pyramide.
	  Type a program to create the pyramide.
	  For example if the number of lines is 5, the pyramide will be like;           *
																			      * * *
																			    * * * * *
																			  * * * * * * *
																			* * * * * * * * *
	 */

    public static void main(String[] args) {
        int num=5;
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=num-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
