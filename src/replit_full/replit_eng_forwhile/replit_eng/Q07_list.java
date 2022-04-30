package replit_full.replit_eng_forwhile.replit_eng;

import java.util.ArrayList;
import java.util.List;

public class Q07_list {
    /*
    write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array

Input :{1,2,3,4,5,6}

element:6

Output : [1,2,3,4,5]
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int input[] ={1,2,3,4,5,6} ;
        for (int i = 0; i <input.length ; i++) {
            list.add(input[i]);
        }
        System.out.println(list);
        list.remove(input.length - 1);
        System.out.println(list);
    }
}
