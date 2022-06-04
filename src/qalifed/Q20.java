package qalifed;

public class Q20 {

    /*
	20.soru
	 Type code to draw isosceles right triangle whose side length will be given by user.
	 For example; if the side is 5 triangle will be like;   *
															* *
															*   *
															*     *
															* * * * *
	 */
    public static void main(String[] args) {
        int num=5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=i ; j++) {
                if (j==1 || j==i || i==num){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            } System.out.println(" ");
        }
    }



}
