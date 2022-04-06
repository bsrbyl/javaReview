package replit;

public class Q25 {
    public static void main(String[] args) {
        //Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.
        //
        //Input : 6
        //
        //Output: 6!=65432*1=720
        int sayi=6;
        int fak=1;
        while(sayi>=1){
       fak*=sayi;

            System.out.print("  "+sayi );
            sayi--;
        }
        System.out.print(" = "+fak);
    }
}
