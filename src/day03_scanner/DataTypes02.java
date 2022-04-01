package day03_scanner;

public class DataTypes02 {
    public static void main(String[] args) {

        char harf='A';
        System.out.println(harf );//A
        System.out.println(harf +1);//66 ascii degerini kullandı.

        char e = '!';
        System.out.println(e+0); //33

        char c1 = 'X', c2='y', c3='?';
        System.out.println(c1+c2+c3);//272

        int i = 5, k= 2;
        System.out.println(i/k);//2

        double a=5,b=2;
        System.out.println(a/b);//2,5

        float z= 2.5F;
        double r=2.5;

        System.out.println(2 + 3 + "Ali");//5Ali
        System.out.println("Ali" + 2 + 3);//Ali23

        System.out.println(2+ 'a' + "B" + (3 + 4));// 99B7



    }
}
