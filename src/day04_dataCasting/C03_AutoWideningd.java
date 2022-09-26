package day04_dataCasting;
public class C03_AutoWideningd {
    public static void main(String[] args) {
        // dar veri turundeki bir degeri, genis veri turundeki variable'a
        // otomatik olarak assign eder
        byte sayi1= 23;
        short sayi2=55;
        int sayi3= sayi1+sayi2; // 78
        double sayi4= sayi1*sayi2; // 1265.0
        sayi4= (double)sayi2/sayi1 ;  // 53.0 / 23 = 2.391 parantez olmayacak ve doable eklemezsek iki sayı tam olduğu için ve önce işlemi yaptığı için sonra atama yapar
        //sayılardan birini double yaptığımız için sonuç double oldu

        System.out.println(sayi4);
    }
}


