package day19_scope;
public class C02_StaticVariables {
    static int staticSayi=10;
    String isim="Mehmet";
    static int degersizStaticVar;
    int degersizInstanceVariable;
    /*
    Class level'daki variable'lara deger atamasak da Java kabul ediyor
     */
    public static void main(String[] args) {
       /*
       bir variable static olusturulduysa
       objeler icin degil class icin gecerlidir
        */
        System.out.println(staticSayi); // 10
        staticMethod();//10
        staticSayi=12;
        System.out.println(staticSayi); // 12
        staticMethod();//12
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();//12
        System.out.println(staticSayi); // 20
        staticMethod();//20 yazdırır çünkü method içerisinde herhangi bir atama yapılmadı buda demek oluyor ki en son atanan değeri yazdırır.
        /*
         instance bir variable'in degerini bulmak icin objenin olusturulmasindan itibaren
         istenen satira kadar kodu takip etmeliyiz
         Static variable'da ise class'in en basindan baslayarak
         istenen satira kadar kodu tekip edip
         static variable'in son degerini bulmamiz gerekir
         */
    }
    public static void staticMethod(){
        //staticSayi=15; buraya değer atasak çağıdığımızda bunu yazdırır.
        // Çünkü class içerisindede yeni bir değer atamış oluruz.(esra)
        System.out.println(staticSayi); // 12 (esra) 12yazdırır çünkü methot içerisinde bir atama yapmadık ve
        // main methot içerisinde en son 12 değeri atandı.static variablar okul adı gibidir bir kere değişti mi herkes için değişir.
    }
    public void staticOlmayanMethod(){
        /*
        static variable'lar class icerisinden her yerden ulasilabilir
        static olsun veya olmasin tum method'lar static variable'lari gorebilir ve degistirebilirler
        farkli method'larda static variable'in hangi degeri alacagini bilmek istiyorsak
        class'in basindan itibaren kodun calismasini takip etmeliyiz
        method ne zaman cagrilirsa o anki static variable degerini method'da kullanabiliriz
         */
        System.out.println(staticSayi); // 12
        staticSayi=20;
    }
}