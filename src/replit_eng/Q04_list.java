package replit_eng;

import java.util.ArrayList;
import java.util.Arrays;

public class Q04_list {
    public static void main(String[] args) {
        ArrayList<String > isimler=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String > asizisimler=new ArrayList<>();
        for (String w:isimler
        ) {
            if (!w.toLowerCase().contains("a")){
                asizisimler.add(w);
            }
        }
        System.out.println(asizisimler);
    }

}
