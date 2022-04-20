package replit_eng_forwhile;

public class Q09 {
    /*
    Write a java program to reverse the number which user entered.

Input :1238
Output :Reverse Of The Number: 8321
     */
    public static void main(String[] args) {
       String input ="1238";
       String tersinput ="";

        for (int i =input.length()-1; i >=0 ; i--) {
            tersinput+=input.substring(i,i+1);
        }
        System.out.println(tersinput);
    }
}
