package deneme;

import java.util.Scanner;

public class C02_indexOf {
    public static void main(String[] args) {
        /* verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
           - verilen kelime cumlede kullanilmamis
           - verilen kelime cumlede sadece 1 kere kullanilmis
           - verilen kelime cumlede birden fazla kullanilmis
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cümle =scan.nextLine();
        int harf=cümle.indexOf('e');
        int kelime=cümle.indexOf("araba");
        String str= ""+cümle.indexOf("");//Stringe char bir değer atıyorsun diye kabul etmedi o nedenle başına hiçlik koydum
        System.out.println(str);//en güzel araba cümlesi için
        System.out.println(kelime);
        System.out.println(harf);


    }
}
