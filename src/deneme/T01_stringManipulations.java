package deneme;

public class T01_stringManipulations {
    public static void main(String[] args) {

        String cumle = "Hayatın amacı keşiftir";
        String isim="Elif Esila";
        String soyisim1="SABANCI";
        String soyisim2=" sabancı ";
        String soyisim3="Sabancı";

        /*1.)concatenation():Birden fazla String' birlestirerek tek bir String haline getirmek için kullanilir.
        Iki sekilde kullanilir.
        + (toplama) isareti ile
         concat() methodu kullanarak */
        System.out.println(soyisim1.concat(isim));

        /*2.) charAt(): Istenen indexdeki karakteri (char) dondurur.
        Index 0'dan baslar, maximum index (String'in uzunlugu - 1) dir.
        Eger method'da index olarak maximum indexden buyuk bir sayi kullanilirsa Java hata verir*/
        System.out.println(cumle.charAt(0));

        //3.)toUpperCase():Girilen String degiskendeki tum harfleri istenen bicime cevirir.
        System.out.println(cumle.toUpperCase());

        //4.)toLowerCase():Girilen String degiskendeki tum harfleri istenen bicime cevirir.
        System.out.println(cumle.toLowerCase());

        /*5.)equals():Verilen iki String'in iceriginin birbirine esit olup olmadigini kontrol eder.
        Eger verilen Stringlerdeki tum karakterler (bosluk, buyuk harf, kucuk harf, ozel
        karakter .) tamamen ayni ise TRUE doner, aksi durumda (bir karakter bile farkli olsa) FALSE doner.*/
        System.out.println(soyisim1.equals(soyisim2));

        /*6.)equalslgnoreCase
        Verilen iki String degiskeni BUYUK HARF / kucuk harf farki gozetmeksizin
        karsilastirir.
        Buyuk / kucuk harf farkliligi disinda herhangi bir karakter farkliligi oldugunda
        equals methodunda oldugu gibi FALSE dondurur.*/
        System.out.println(soyisim1.equalsIgnoreCase(soyisim3));

        //7.)length():Verilen String'deki karakter sayisini dondurur.
        System.out.println(isim.length());

        //8.)index0f():Verilen String'de istenen char veya stringi kaçıncı index'te ilk kez kullanıldığını dondurur.
        //2 paremetre kullanılabilir.Atama durumunda int data türüne atanabiliyor.(int değer olduğu için String kabu etmiyor)
        System.out.println(cumle.indexOf('a', 5));//8

        //9.)lastIndex0f():Verilen String'de istenen char veya stringi kaçıncı index'te son kez kullanıldığını dondurur.
        //Aramaya sondan başlar fakat index'e (saymaya) baştan başlar.2 parametre girersek armaya istediğimiz index'ten başlar.
        System.out.println(cumle.lastIndexOf("ke",15));

        //10.)contains():Verilen string'in istenilen karekterleri icerip icermedigini kontrol eder, Iceriyorsa TRUE,içermiyorsa FALSE döner.
        System.out.println(cumle.contains("keş"));

        //11.)endsWith() Verilen String'in istenen karakterler ile bitip bitmedigini kontrol eder.
        // Istenen karakter (ler) ile bitiyorsa TRUE, yoksa FALSE dondurur.""hiçlik ve cümlenin tamamınıda yazsak true döner.
        System.out.println(isim.endsWith("esila"));

        //12.)startsWith():Verilen String'in istenen karakter(ler) ile baslayip baslamadigini kontrol eder.
        //Istenenkarakter(ler) ile basliyorsa TRUE, yoksa FALSE dondurur.""hiçlik ve cümlenin tamamınıda yazsak true döner.
        System.out.println("".isEmpty());

        //13.)isEmpty():Verilen String'in uzunlugu O(sifir) ise (Hiçbir karakter icermiyorsa) TRUE, yoksa FALSE dondurur."" True dönderir.
        System.out.println(cumle.isEmpty());
        System.out.println("".isEmpty());
        //14.)replace ():Verilen String'deki istenen karakter(ler)i istenen yeni karakter (ler) ile degistirir.
        //tek karakter için char'da kullanılabilir.CAMEL CASE
        System.out.println(isim.replace("Esila","zehra").replace(" ",""));
        /*15.)replaceAlL():replace() methodu ile benzer olarak verilen String'deki istenen karakter(ler)i istenen
        yeni karakter (ler) ile degistirir. Aralarindaki farklar replace()methodunda char kullanilabilir,replaceAll()'da char kullanilamaz
        replaceAlI() methodunda Regular Expressions kullanilabilir.
        \\s bosluk (space)
        \\S bosluk disindaki tum karakterler
        \\w harfler ve rakamlar (a-z, A-Z, 0-9)
        \\W harfler ve rakamlar disindaki tum karakterler
        \\d rakamlar (0-9)
        \\D rakamlar disindaki tum karakterler */
        System.out.println(cumle.replaceAll("\\w","X"));

        //16.)replaceFirst():Verilen String'deki istenen karakter(ler) in ilkini, istenen yeni karakter(ler) ile degistirir
        System.out.println(cumle.replaceFirst("\\s","*"));

        //17.)substring():Index kullanarak verilen String' in istenen parcasini almamizi saglar.Parametre olarak 1 sayi girilirse, girilen index'den String'in sonuna kadar bolumu
        //Parametre olarak 2 sayi girilirse, girilen 1.sayidaki indexden (inclusive) baslayip,
        //2.sayiya kadar (exclusive) karakteri bize dondurur
        System.out.println();

        // 18.)Trim():Istedigimiz String' in basinda veya sonunda var olan bosluk / "space" leri temizler
        System.out.println(soyisim2.trim());
        //istediğimiz kadar string methodunu arka arkaya kulanabiliriz.(charAt olmaz çünkü string değil)
        //boolean olarak dönenler
    }

}
