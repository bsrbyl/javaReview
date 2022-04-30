package replit_full.replit_eng_forwhile.replit_eng;

import java.util.Arrays;
import java.util.List;

public class Q02_list {
    /*
    Create a 10-element list. Swap the 8th element with the 3rd element.

INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};

Output:

[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
     */
    public static void main(String[] args) {
        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        List<String> yeninames= Arrays.asList(names);
        int ilkIndex=8;
        int ikinciIndex=3;
        String temp = " ";
        System.out.println(yeninames);

        if ((ilkIndex >yeninames.size() - 1) || (ikinciIndex > yeninames.size() - 1)
                || ilkIndex<0 || ikinciIndex<0) {
            System.out.println("Lutfen Gecerli bir index giriniz");
        } else {
            temp=yeninames.get(ilkIndex);
            yeninames.set(ilkIndex,yeninames.get(ikinciIndex));
            yeninames.set(ikinciIndex,temp);
        }
        System.out.println(yeninames);

    }
}
