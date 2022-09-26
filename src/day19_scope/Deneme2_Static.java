package day19_scope;

public class Deneme2_Static {
    static int sayı1 = 1;
    static int sayı2 = 10;
    int ins = 100;

    public static void main(String[] args) {
        sayı1 = 2;
        staticmett();//3 burda 3 yazdırdı ama aşağıda 4 olarak yazdırır ve o satırdan sonra yeni bir değer atanmazsa bütün işlemlede 4 baz alır
        System.out.println(sayı1);//4 yazdırır
        int toplam = sayı1 + sayı2;
        System.out.println(toplam);//14 sayı1 artık 4 olarak alıyor. sayı2 burada ata
        Deneme2_Static obje1 = new Deneme2_Static();
        obje1.staticolmayan();//15,4,19//bu kısmı yazmazsak  aşağıda yazdıırdığımızda sayı 2yi en baştaki değerini getirdi burdada değer atamadığımız için.
        //sayı1 değerini 1 getirmiyor çünkü burada en son değeri 4 'tü
        System.out.println(sayı2);//15
        System.out.println(obje1.ins);
        System.out.println(obje1.ins+sayı1);//farklı variable olan iki sayı toplanabiliyor.
        //eğer sayının başlangıç  değerini istemiyorsak objeyi bir kere açıp hep kullanabiliriz.

    }

    public static void staticmett() {
        sayı1 = 3;
        System.out.println(sayı1);
        sayı1 = 4;


    }

    public void staticolmayan() {
        sayı2 = 15;
        System.out.println(sayı2);
        System.out.println(sayı1);
        System.out.println(sayı1 + sayı2);


    }
}
