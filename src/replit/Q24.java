package replit;

public class Q24 {
    public static void main(String[] args) {
        //Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
        //
        //Input :
        //
        //String str=“Javaisalsoeasy”
        //
        //Output: a s
        int sayac=0;
        String str="Javaisalsoeasy";
        String bosKutu="";
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <str.length() ; j++) {
                if (str.valueOf(str.charAt(i)).equals(str.valueOf(str.charAt(j)))){
                    if (!bosKutu.contains(str.valueOf(str.charAt(i)))){
                        bosKutu+=str.valueOf(str.charAt(i))+ " ";
                    }
                }
            }

        }
        System.out.println(bosKutu);
    }
}
