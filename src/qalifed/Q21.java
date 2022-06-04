package qalifed;

import java.util.Arrays;

public class Q21 {

    /*
	21.soru
	 	Ebay Interview Question
	 	Put all zeros to end in an integer array
	 	{3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
	 	{0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
	 	*/


    public static void main(String[] args) {


     int arr[]={3, 0, 4, 2, 0};
     int arr2[]={0, 0, 1, 2, 0, 3};
     int yeniarr[]=new int[arr.length];
     int yeniarr2[]=new int[arr2.length];
     int sayac=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] != 0) {
                yeniarr[sayac++]=arr[i];

            }
        }
        while (sayac< arr.length)
            yeniarr[sayac++]=0;
        System.out.println(Arrays.toString(yeniarr));
sayac=0;

        for (int i = 0; i <arr2.length ; i++) {
            if (arr2[i] != 0) {
                yeniarr2[sayac++]=arr2[i];

            }
        }
        while (sayac< arr2.length)
            yeniarr2[sayac++]=0;
        System.out.println(Arrays.toString(yeniarr2));
}
}
