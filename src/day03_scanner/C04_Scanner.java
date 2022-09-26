package day03_scanner;

import java.util.Scanner;// burası gelmediği zaman scanner kırmızı olur. bu durumda scanner üzerine gel import
//class çıkacak ona bas ihtiyacımız olan kitabı getirecek kütüphaneden

public class C04_Scanner {
    public static void main(String[] args) {
        //kulanıcıdan ismini isteyin
        //girilen ismi
        //isminiz:ismail şeklinde yazdırın
        //insanların dünyasından kodlarımızın bulunduğu classa deger almak için
        //scanner classını kullanırız
        //scanner objesini oluşturalım
        Scanner scan=new Scanner(System.in);
        //kullanıcıya ne istediğimizi söyleyelim.

        System.out.println("lütfen isminizi giriniz");

        // 3- olusturdugumuz scan objesi ile kullanicinin girdigi degeri alip
        //    olusturacagimiz uygun bir variable'a atayalim

        String kullaniciIsmi=scan.next();
        System.out.println("Isminiz:"+kullaniciIsmi);
    }
}
