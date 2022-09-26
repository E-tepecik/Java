package deneme;

public class Replit_1 {
   // 2 kelime oluşturun: isim1 ve isim2

    // isim1 çift sayıda karakter içeriyorsa,

    // ikinci kelimeyi ilk adın ortasına yerleştirin

    // ilk kelime tek sayida karakter iceriyorsa

    // “isim1, isim2 ye eklenemiyor” yazdırın

    // Örneğin:
    // isim1= mehmet
    // isim2= ahmet
    // Yazdır ==> mehahmetmet

    // isim1= memet
    // isim2= ahmet
    // Yazdır ==> isim1, isim2 ye eklenemiyor
    public static void main(String[] args) {
        String isim1 = "esra";
        String isim2 = "emine";

        System.out.println(isim1.length() % 2 == 0 ? (isim1.substring(0, isim1.length() / 2)
                + isim2 + isim1.substring(isim1.length() / 2)) : "isim1, isim2 ye eklenemiyor");



    /* Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
    Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.
    Eger aynı karakterlere sahipse
"isim ayni karakterlere sahiptir." yazdirin.
    Eger ayni kaakterlere sahip degilse
"Dizenin benzersiz karakterleri var" yazdirin.
    Ternary kullanin.
     */
        String isim3="es";
        System.out.println(!(isim3.length()==3)? "3 karekter girin" :
                (isim3.charAt(0)==isim3.charAt(1) || isim3.charAt(0)==isim3.charAt(2) || isim3.charAt(1)==isim3.charAt(2)) ?
                "isim ayni karakterlere sahiptir.": "Dizenin benzersiz karakterleri var");

        System.out.println(isim3.indexOf(isim3.charAt(0)+1)==-1);

        /*Bir aydaki gün sayısını hesaplayan bir Java programı yazınız.
                INPUT:
        Ay Numarasi:
        2
        Yil :
        2016
        OUTPUT :
        Subat 2016 29 Gundur.
         */
        int ay;
        int ay1=30;
        int ay2=31;
        int ay3=29;
        int ay4=28;



        }

    }


