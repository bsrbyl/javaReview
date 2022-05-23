package qalifed;

public class Q6 {
    //6.	Create a program checks if a String is palindrome or not. If a word, phrase, or sequence
    // that reads the same backward as forward then it is called "Palindrome",   For example, "madam" or "nurses run".

    public static void main(String[] args) {



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