package replit_full.replit_eng_forwhile.replit_eng;

import java.util.Arrays;

public class Q08_Arrays {
    /*
    Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.

Input1={1,2,3,4}

Input2={5,6}

Output={1,2,3,4,5,6}
     */
    public static void main(String[] args) {
        int input1[] ={1,2,3,4};

        int input2[] ={5,6};
       int myarr[]= new int[input1.length+ input2.length];

        for (int i = 0; i <input1.length ; i++) {
            myarr[i]=input1[i];
        }

        for (int i = input1.length; i <myarr.length ; i++) {
           myarr[i]= input2[i-input1.length];
        }
        System.out.println(Arrays.toString(myarr));
    }
}
