package replit_eng;

public class Q02_Array {
    public static void main(String[] args) {
        /*
        Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

Input : Coding is greate.

Output : .etaerg si gnidoC
         */
       String input = "Coding is greate.";
       String tersInput = "";
       String arr[]=new String[input.length()];
        for (int i = input.length()-1; i >=0 ; i--) {
            arr[i]=input.substring(i,i+1);
            tersInput+=arr[i];
        }
        System.out.println("tersInput = " + tersInput);
    }
}
