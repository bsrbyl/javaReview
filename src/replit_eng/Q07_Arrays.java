package replit_eng;

public class Q07_Arrays {
    /*
    Write a method that accepts an array as parameter and returns sum off all elements in the array Then print the result in the main method.

Eg :

input : {1,2,3,4,5,6,7,8};

output: 36
    
     */
    public static void main(String[] args) {
       int input[]={1,2,3,4,5,6,7,8}; 
       int toplam=0;
        for (int i = 0; i < input.length; i++) {
            toplam += input[i];
        }

        System.out.println("toplam = " + toplam);
    }
}
