package replit_eng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q09_List {
    /*
    Write a Java program to get a String from user as input and find the maximum occurring character in that string.(Ignore case sensitivity).

Input : Learning java is easy

Output: maximum occurring character is : a
     */
    public static void main(String[] args) {
        String input ="Learning java is easy";
        List<String> enCokYazilan= new ArrayList<>();
        int counter=0;
        int maxCounter=0;


        for (int i = 0; i <input.length() ; i++) {
            for (int j = i+1; j <input.length() ; j++) {
                if (input.substring(i, i + 1).equalsIgnoreCase(input.substring(j, j + 1))) {
                    counter++;
                }
            }
            if (counter>maxCounter){
                maxCounter=counter;

                enCokYazilan.set(0,input.substring(i,i+1));

            }else if(counter==maxCounter){

                enCokYazilan.add(input.substring(i,i+1));

            }
            counter=0;
        }

        System.out.println(enCokYazilan);

    }
}
