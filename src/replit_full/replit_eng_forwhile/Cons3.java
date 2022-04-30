package replit_full.replit_eng_forwhile;

public class Cons3 {
    /*
      Create 2 constructors one is with parameters, the other one is without parameter.
      By using that constructors create at least 2 objects then print their features on the console.
      Biri parametreli, diğeri parametresiz 2 kurucu oluşturun.
      Bu yapıcıları kullanarak en az 2 nesne oluşturun ve özelliklerini konsolda yazdırın.
     */
    String parameters ;
    int sayi;
   public Cons3(){

}

    @Override
    public String toString() {
        return "Cons3{" +
                "parameters='" + parameters + '\'' +
                ", sayi=" + sayi +
                '}';
    }

    public Cons3(String parameters, int sayi){
this.parameters = parameters;
this.sayi = sayi;
}


    public static void main(String[] args) {
        Cons3 obj1 = new Cons3("cons",1);
        Cons3 obj2 = new Cons3("cons2",2);
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());

    }
}
