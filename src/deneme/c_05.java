package deneme;

import java.util.Scanner;

public class c_05 {
    public static void main(String[] args) {
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin.
         * degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("kelime");
        String kelime=scan.next();
        if (kelime.length()>=3) {
           String sonuc=kelime.substring(kelime.length()-2);
        System.out.println("sonuc = " + sonuc+sonuc+sonuc);
        } else{
            System.out.println(kelime);

        }
    }
}
