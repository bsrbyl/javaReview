package qalifed;

import java.util.Scanner;

public class Q6_2 {
    //Create a program checks if a String is palindrome or not.
    // If a word, phrase, or sequence that reads the same backward as forward then it is called "Palindrome",
    // For example, "madam" or "nurses run".
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        palindromeCheck();
    }
    public static void palindromeCheck() {
        System.out.println("please enter a word or phrase");
        String entry = scan.nextLine().replaceAll(" ", "");
        StringBuilder sb = new StringBuilder(entry);
        sb.reverse();
        System.out.println(entry.contentEquals(sb) ? "this entry is palindrome" : "this entry is not palindrome");
    }
}
