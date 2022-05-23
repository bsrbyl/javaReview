package qalifed;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Q4 {
    //4.	Write a java program that checks prime numbers.
    public static void main(String[] args) {


    int sayi= 1;

    boolean asalMi=true;
        if (sayi>=2) {
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0 && sayi!=0 && sayi!=1) {
                asalMi = false;
                break;
            }
        }
        if (asalMi) {
            System.out.println("sayi asaldir");
        } else {
            System.out.println("sayi asal degildir");
        }
    }else{
            System.out.println(" gecerli birsayi giriniz");
        }

        System.out.println(isPrime(123));
   }

   //2 lambda
   private static boolean isPrime(int number) {

       IntPredicate isDivisible = index -> number % index == 0;
       return number > 1 && IntStream.range(2, number - 1).noneMatch(isDivisible);
   }

  }