package replit_full.replit_eng_forwhile.replit_eng;

import java.util.ArrayList;
import java.util.List;

public class Q08_list {
    public static void main(String[] args) {
        String input= "nazan";
        List<String > tersInput =new ArrayList<>();
        input=input.trim();
        for (int i = input.length()-1 ; i >=0 ; i--) {
            tersInput.add(input.substring(i,i+1));
        }
        String  tersStr="";
        for (int i = 0; i <tersInput.size() ; i++) {
            tersStr+=tersInput.get(i);
        }
        System.out.println(tersStr);
        if (input.equalsIgnoreCase(tersStr)){
            System.out.println(" girdiginiz cumle polidrome'dur ");
        }else System.out.println("girdiginiz cumle polidrome degildir");
    }
}
