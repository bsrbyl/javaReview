package day15_MethodCreation;

public class C06_MethodCreation {
    public static void main(String[] args) {
       hosgeldinYazdir();



    }

    private static void kapanmaMethodu() {
        System.out.println("bizi tercih ettiginiz icin tesekkurler");
    }

    public static void hosgeldinYazdir() {
        System.out.println("Hosgeldin");
        stringYazdir("boyle de olur");

    }

    private static void stringYazdir(String str) {
        System.out.println(str);
        kapanmaMethodu();
    }
}
