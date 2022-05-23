package qalifed;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {
    //5.	Create a function that takes an array and returns the difference between the biggest and
    // the smallest numbers.  Ask user to enter array elements.


    public static void main(String[] args) {
//1

        int[] arrayNums = {5, 7, 2, 4, 9};
        System.out.println("Original Array: "+Arrays.toString(arrayNums));
        int max= Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arrayNums.length; i++)
        {
            if(arrayNums[i] > max)
                max = arrayNums[i];
            else if(arrayNums[i] < min)
                min = arrayNums[i];
        }
        System.out.println("Difference between the largest and smallest values of the said array: "+(max-min));

        //2
        arrayListe();


    }

    private static void arrayListe() {
        Scanner scan=new Scanner(System.in);
        System.out.print("liste uzunlugu giriniz : ");
        int uzunluk= scan.nextInt();
        int arr[]=new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("listenin "+(i+1)+" . elemanini giriniz : ");
            arr[i]= scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[uzunluk-1]+ " - "+ arr[0]+" = "+ (arr[uzunluk-1]-arr[0]));
    }
}
