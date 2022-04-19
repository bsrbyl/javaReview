package replit_eng_forwhile;

public class StrinBuilder1 {
    public static void main(String[] args) {
        /*
        Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder
        and checks if sentence is palindrome or not (without case sensitivity) Eg : input : I love Java
        Output: "Reversed sentence : avaJ evol I . It is not a palindrome"
         */


        StringBuilder cumle=new StringBuilder(" I love Java");
        System.out.println("cumlenin normal hali : "+ cumle);
        StringBuilder terscumle=new StringBuilder(cumle.reverse());
        System.out.println("cumleninters hali : "+ terscumle);
        if (cumle.reverse().toString().equalsIgnoreCase(terscumle.toString())){
            System.out.println("girdiginiz cumle palindromdur");
        }else {
            System.out.println("girdiginiz cumle palindrom degildir");
        }

    }
}
