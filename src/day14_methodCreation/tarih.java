package day14_methodCreation;

import java.util.Scanner;

public class tarih {
    public static void main(String[] args) {


     /*
          Eger bir class'in icerisinde herhangi bir hesaplama yapip
          bunu da kalici olarak saklamak istersek
          kodumuzu sade ve anlasilir tutmak icin
          islemi bir method'da yapip
          sonucunu main method'a dondurebiliriz
          Return type'i void olmayan bir method'un sonucunu
          main method'da bir variable'a atama yaparsak
          programin geri kalaninda bu yeni degeri kullanma sansimiz olur
         */
        // kullanicidan sehir ismini ve dogum tarihini alip
        // bunlari programda kullanacagimiz formatta bize donduren bir method olusturun
        // Sehir ismini programimizda buyuk harf olarak,
        // tarihi ise 2022-06-30 seklinde kullanmak istiyoruz



        String dogumtarihi = tarih1();
        String dogumyeri = sehir1();
        System.out.print(dogumtarihi);
        System.out.print(" "+dogumyeri);

    }

    public static String sehir1() {
        Scanner scan=new Scanner(System.in);
        System.out.println("şehir giriniz");
        String sehir=scan.next().toUpperCase();


        return sehir;
    }

    public static String tarih1() {
        Scanner scan=new Scanner(System.in);

        String tarih = "";

        System.out.println("yıl");
        int yıl=scan.nextInt();


        if (1900>yıl && yıl >2100){
            System.out.println("lütfen geçerli bir yıl giriniz");

        } else  {
            tarih+=yıl+"-";
        }
        System.out.println("ay");
        int ay=scan.nextInt();
        if (ay>12 && ay<0){
            System.out.println("lütfen geçerli bir yıl ay giriniz");

        } else if (ay<10){
            tarih+="0"+ay+"-";
        }else {
            tarih += ay + "-";

        }
        System.out.println("gün");
        int gun=scan.nextInt();
        if (gun<0 && gun>31) {
            System.out.println("lütfen geçerli bir yıl ay giriniz");

        } else if (gun<10) {
            tarih+="0"+gun;

        } else {
            tarih+=gun;

        }
        return tarih;
    }
}