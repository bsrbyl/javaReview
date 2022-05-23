package qalifed;

public class Q1 {
//1.	Write a Java Program to reverse a string
public static void main(String[] args) {

    String str="bakicaz bakalim";
    String yenistr = "";
    String yenistr2 = "";
    //1
    for (int i =str.length()-1; i >=0 ; i--) {
        yenistr+=str.substring(i,i+1);
    }
    //2
    String metin="kod pratigi";
     String sonuc="";
    for(int i=metin.length()-1; i>=0; i--) {
        sonuc += metin.charAt(i);
    }
    System.out.println(sonuc);
    //3
    StringBuffer a = new StringBuffer("nazaN");
    System.out.println(a.reverse());


    System.out.println(yenistr);


      }

     }
