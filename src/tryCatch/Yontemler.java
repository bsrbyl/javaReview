package tryCatch;

public class Yontemler {
   /*                       *1*
    while (true) {
        try {
            System.out.println("lütfen giriş yapınız");
            giris =scan.nextInt();
            break;
        } catch (Exception e){
            scan.nextLine();
            System.out.println("Hatalı giriş yaptınız.");
        }
    }

    */

    /*                         *2*
    public static int intInput(){

        Scanner scanner = new Scanner(System.in);
        try{
            input = scanner.nextInt();

        }catch(InputMismatchException e){
            System.out.println("Invalid input, please try again ");
            intInput();//recursive
        }
        return input;
    }
     */
}
