package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        kullanicidan ismini soyismini ve yasini alip
        girilen bilgiler = seyfi capar 34  seklinde yazdirin
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen isminizi giriniz");
        String isim = scan.nextLine();
        /*
         String verileri scanner ile alirken
         next( ) : ilk bosluga kadar olan kismi(1 kelime) alir
         nextLine() :satirin sonuna kadar ne yazarsak alir
         NOT : eger ardarda birden fazla String deger alacaksak nextLine() kullanmaliyiz
                 */

        System.out.println("Lutfen Soyisminizi giriniz");
        String Soyisim = scan.nextLine();

        System.out.println("lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        System.out.println("girilen bilgiler=" + isim + " ," + Soyisim + " ," + yas);// boşluk bırakmak için " kullandık.


    }
}
