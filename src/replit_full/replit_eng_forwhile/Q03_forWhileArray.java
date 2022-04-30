package replit_full.replit_eng_forwhile;

import java.util.ArrayList;
import java.util.List;

public class Q03_forWhileArray {
    public static void main(String[] args) {
        /*
        Write a code that returns the duplicate chars in a String array.(interview Question)

Input :

String str=“Javaisalsoeasy”

Output: [a, s]
         */

        int sayac=0;
        String str="Javaisalsoeasy";
        List<String> bosKutu=new ArrayList<>();
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if (str.valueOf(str.charAt(i)).equals(str.valueOf(str.charAt(j)))){
                    if (!bosKutu.contains(str.valueOf(str.charAt(i)))){
                        bosKutu.add(str.valueOf(str.charAt(i)));
                    }
                }
            }

        }
        System.out.println(bosKutu);
    }
}
