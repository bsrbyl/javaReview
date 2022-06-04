package qalifed;

public class Q19 {

     /*
	19.soru
	  	Ask user to enter the number of lines of an inverted pyramid.
	  	Type a program to create the inverted pyramid.
  	    For example; if the number of lines is 5, the pyramid will be like; * * * * * * * * *
																			  * * * * * * *
																			    * * * * *
																			      * * *
																			        *
    */
     public static void main(String[] args) {
         int num=5;
         for (int i = 0; i < num; i++) {
             for (int j = 0; j <i ; j++) {
                 System.out.print("# ");
             }
             for (int j = 0; j <num-i; j++) {
                 System.out.print("* ");

             }
             for (int j = 1; j <num-i ; j++) {
                 System.out.print("* ");
             }
             System.out.println("");
         }

     }
}
