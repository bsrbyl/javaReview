package qalifed;

public class Q3 {
    //3.	Write a java program that encodes fibonacci number

    public static void main(String[] args) {
//1 10 sayidan olusan fibo serisi
        int n1=0;
        int n2=1;
        int n3,count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for( int i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

//2 100'e kadar olan fibonacci
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
