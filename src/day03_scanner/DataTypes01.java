package day03_scanner;

public class DataTypes01 {

    /*
    primitive ve non - primitive datatypes aarasindaki fark nedir?
    1)sadece values digeri values and methods
     */
    public static void main(String[] args) {

        boolean isRetired = false;
        boolean isOld = true;

        char initial = 'A';
        // byte -128 ve 127
        byte age = 14;
        //short -326768 ve 32767
        short numberOfStudentInSchool = 2134;
        //int -2,147,483,648 ve 2,147,483,647
        int annualProfitOfApple = 2000000000;
        // long -9,223,372,036,854,755,808 ve -9,223,372,036,854,755,807
        long populationOfTheWorld= 7000000000L;

        float priceOfShirt =12.99F;

        double weightOfACell =0.00001230004;

        String s="Ali";
        System.out.println(s.toUpperCase());//ALI
        System.out.println( s.toLowerCase());//ali

    }
    }


