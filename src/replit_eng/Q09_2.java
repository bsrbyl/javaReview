package replit_eng;

public class Q09_2 {
    public static void main(String[] args) {
        String kelime="javvvvva cok guzel";
        int sayi=0;
        int max=0;
        int index = 0;
        for (int i = 0; i < kelime.length(); i++)
        {
            sayi=0;
            for (int j = 0; j < kelime.length(); j++)
            {
                if(kelime.charAt(i)==kelime.charAt(j))
                    sayi++;
            }
            if(sayi>max)
            {
                max = sayi;
                index = i;
            }
        }
        System.out.println("En çok kullanılan harf:"+kelime.charAt(index)); System.out.println("Harfin tekrar sayısı:"+max);
    }

}
