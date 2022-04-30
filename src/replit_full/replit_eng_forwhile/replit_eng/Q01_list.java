package replit_full.replit_eng_forwhile.replit_eng;

import java.util.ArrayList;
import java.util.List;

public class Q01_list {
    /*
    Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

input :

Learning java is easy

output:

maximum occurring character is : a
     */
    public static void main(String[] args) {
        int sayac=0;
       String input =" Learning java is easy";
       List<String> inputList = new ArrayList<String>();
        for (int i = 0; i < input.length(); i++) {
            inputList.add(input.substring(i,i+1));
            if (inputList.equals(input.substring(i,i+1))){
                sayac++;
            }
            sayac=0;
        }



    }


}
