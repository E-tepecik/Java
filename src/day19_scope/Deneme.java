package day19_scope;

import java.util.logging.SocketHandler;

public class Deneme {

    int sayı1 = 1;
    int sayı2 = 10;
    String ad = "esra";

    public static void main(String[] args) {
        Deneme obje1 = new Deneme();
        System.out.println(obje1.sayı1);//1
        obje1.sayı1 = 2;
        System.out.println(obje1.sayı1);//2
        Deneme obje2 = new Deneme();
        obje2.staticdegil();//4
        obje2.sayı1 = 5; //aynı isimden kullanabiliyormuyuz denedim.static methodlarda bir kez açıp kullanabiliyoruz.
        obje2.sayı2 = 20;//aynı isimden kullanabiliyormuyuz denedim
        System.out.println(obje2.sayı1);//5
        Deneme obje3 = new Deneme();
        System.out.println(obje3.sayı1);//1-->sebebi her obje oluşturulduğunda ilk baştaki değerini alır
        staticmet();//3/ methodun yazdırdığim satırın altına atama yaptım ama onu yazdırmadı.
        staticmet();//6/burda yazdırıyor çünkü altına yazdım.


    }

    public static void staticmet() {
        Deneme obje1 = new Deneme();//main methottada obje1 adında açtım oldu.
        obje1.sayı2 = 11;//iki farklı instance variable
        obje1.sayı1 = 3;
        System.out.println(obje1.sayı1);//sadece obje şeklinde yazarsak referansını getiriyor yanına istediğimiz değeride yazmalıyız
        obje1.sayı1 = 6;
        System.out.println(obje1.sayı1);
    }

    public void staticdegil() {
        sayı1 = 4;
        System.out.println(sayı1);
        sayı1=8;
    }

}