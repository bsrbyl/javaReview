package day17_forLoop;

public class C01_palindrome {
    public static void main(String[] args) {
        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome olup olmadigini
        // kontrol eden bir method yazin

         String input="Nazan";
         PolindromeKontrolEt(input);
    }

    private static void PolindromeKontrolEt(String input) {

         String terstenInput="";

        for (int i = input.length()-1; i >=0 ; i--) {

            terstenInput+=input.charAt(i);
        }
        System.out.println("girdiginiz kelimenin tersi : "+terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("girdiginiz kelime bir polindrome dir");
            
        }else{
            System.out.println("girdiginiz kelime bir polindrome degildir");
        }
        
    }
}
