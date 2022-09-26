package day14_methodCreation;

public class isimgizle {
    // verilen isim ve soyismi ilk harfi buyuk
    // geriye kalanlari * olacak sekilde degistirip
    // bize bu halini donduren bir method olusturun
    // NOT : programin ilerleyen kisimlarinda isim ve soyismi bu sekilde kullanmak istiyoruz.

    public static void main(String[] args) {
        String isim1="Esra";
        String soyisim2="Tepecik";
String gizleismi=gizliisim(isim1,soyisim2);
        System.out.println(gizliisim(isim1,soyisim2));
        System.out.println(gizleismi);
        System.out.println(isim1+" "+soyisim2);
    }

    public static String gizliisim(String isim5,String soyisim5) {
        String isim4=isim5.substring(0,1).toUpperCase()+isim5.substring(1).replaceAll("\\w","*");
        String soyisim4=soyisim5.substring(0,1).toUpperCase()+isim5.substring(1).replaceAll("\\w","*");

        return isim4+" "+soyisim4;

    }


}
