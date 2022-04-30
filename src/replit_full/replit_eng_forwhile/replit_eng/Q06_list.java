package replit_full.replit_eng_forwhile.replit_eng;

import java.util.ArrayList;
import java.util.List;

public class Q06_list {
    /*
    Write a program to find the common elements between two String Arrays (without case sensitivity)

Input1 : {John,Brad,Ange,Sofia,Emily}

Input2 : {sofia,brad,grace,emily,hazel}

Output : [sofia,brad,emily]

     */
    public static void main(String[] args) {
       String input1[]= {"John","Brad","Ange","Sofia","Emily"};
      String  input2[] ={"sofia","brad","grace","emily","hazel"};
        List<String>ortaklist = new ArrayList<String>();

        for (int i = 0; i <input1.length ; i++) {
            for (int j = 0; j <input2.length ; j++) {
                if (input1[i].equalsIgnoreCase(input2[j])) {
                    ortaklist.add(input1[i]);
                }
            }
        }
        System.out.println(ortaklist);

    }
}
