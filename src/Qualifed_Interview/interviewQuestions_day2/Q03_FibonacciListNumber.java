package Qualifed_Interview.interviewQuestions_day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03_FibonacciListNumber {

    /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {
        List<Integer> fibonacci = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz :");
        int sayi = scan.nextInt();
        fibonacci.add(0);
        fibonacci.add(1);

        int i=1;
        if(sayi<=1){
            System.out.println("Daha buyuk tamsayi giriniz ... ");
        }else{
            while(fibonacci.get(i)< sayi){ //fibonacci elemanlari, sayidan kucuk oldugu surece,
                fibonacci.add(fibonacci.get(i) + fibonacci.get(i-1)); //bir onceki eleman ile topla
                i++;
            }
            if(fibonacci.get(fibonacci.size()-1)>sayi) { //fibonaccideki son eleman, sayidan buyukse
                fibonacci.remove(fibonacci.size()-1); //bu elemani kaldir
                System.out.println("Girdiginiz sayi fibonacci dizisinde bulunmamaktadir ." +
                        "\n Girilen sayiya kadar fibonacci dizisi : " + fibonacci);
            }else
                System.out.println("Girdiginiz sayi fibonacci dizisinde bulunmaktadir..:" + fibonacci);

        }


        //2 10 sayidan olusan fibo serisi
        int n1=0;
        int n2=1;
        int n3,count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for( int j=2;j<count;j++)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

      //3 100'e kadar olan fibonacci
        System.out.println();
        int n = 100, firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series Upto " + n + ": ");

        while (firstTerm <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }



    }

}
