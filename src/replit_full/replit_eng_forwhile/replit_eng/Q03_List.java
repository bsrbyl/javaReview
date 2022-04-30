package replit_full.replit_eng_forwhile.replit_eng;

import java.util.ArrayList;
import java.util.List;

public class Q03_List {
    /*
    Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.

Note: Upper and lower case letters, spaces and special characters will not be changed.

Input :

It is very nice to write code.

Output :

.edoc etirw ot ecin yrev si tI
     */

    public static void main(String[] args) {

        String cumle="It is very nice to write code.";
        List<String> terscumle= new ArrayList<>();
        for (int i = cumle.length()-1; i >=0 ; i--) {
            terscumle.add(cumle.substring(i,i+1));

        }
        System.out.println(terscumle);
String yeniterscumle="";
        for (int i = 0; i < terscumle.size(); i++) {
            yeniterscumle+=terscumle.get(i);
        }

        System.out.println(yeniterscumle);
    }


}
