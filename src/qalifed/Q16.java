package qalifed;

public class Q16 {
    /*
16.soru
   Ask user to enter the number of lines of a inverted half pyramid.
   Type a program to create the inverted half pyramid.
    For example if the number of lines is 5, the pyramid will be like;
                                                      * * * * *
                                                      * * * *
                                                      * * *
                                                      * *
                                                      *
   */
    public static void main(String[] args) {
        int num=5;

        for (int j = 0; j <num; j++) {
            for (int i = 0; i <num-j ; i++) {
                System.out.print("* ");
            }
            System.out.println("");


        }

    }
}
