package replit_eng;

public class Q05_Arrays {
    /*
    Write a java program that calculates the average value of array elements

input[]= {1,2,3,4,5,6,7}

Output : 4
     */
    public static void main(String[] args) {
       int input[]= {1,2,3,4,5,6,7};
        for (int i = 0; i < input.length; i++) {
            if (input.length%2==0){
                System.out.println("girdiginiz sayinin uzunlugu cift");
            }else {
                System.out.println(input[((input.length-1)/2)]);
                break;
            }
        }

    }
}
