package day19_scope;

public class Deneme_cagırma {
    public static void main(String[] args) {

        System.out.println(Deneme2_Static.sayı1);//1//methodu çağırmadan yazdırırsak başlangıçtaki değeri veriyor.
        Deneme2_Static.staticmett();//3 methodu çağırdığımızda method içerisindeki sout üzerinde en son hangi değer atanmış ise onu getirir. fakat sout'un altında değer atanmışsa bu çağırma işleminden sonraki yapılacak işlemlerde o değer baz alınır.
        System.out.println(Deneme2_Static.sayı2);//10
        System.out.println(Deneme2_Static.sayı1);//4
        Deneme obje1=new Deneme();
        obje1.staticdegil();//4//methodu çağırdığımızda method içerisindeki sout üzerinde en son hangi değer atanmış ise onu getirir. fakat sout'un altında değer atanmışsa bu çağırma işleminden sonraki yapılacak işlemlerde o değer baz alınır.
        System.out.println(obje1.sayı1);//8
        System.out.println(obje1.sayı2);//10
        Deneme2_Static obje2=new Deneme2_Static();
        obje2.staticolmayan();//15,4,19 alt alta yazdırdı.

    }
}
