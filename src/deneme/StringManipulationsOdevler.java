package deneme;

import java.util.Scanner;

public class StringManipulationsOdevler {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        //1.Soru
          /* String methotlarını kullanarak "Java ogrenmek123 Cok guzel@"
        "Java ogrenmek cok guzel" yazdırın
         */
        String cumle="Java ogrenmek123 Cok guzel@";
        String cumle5=cumle.replaceAll("\\s","asdf").replaceAll("\\W","")
                .replaceAll("\\d","").replaceAll("asdf"," ").replace("C","c");
         /* Soru2
           String verilen iki sayinin toplamini yazdiriniz
           str1="13.99"
           str2="10.55" */
        String str1="$13,99";
        String str2="$10,55";
        str1=str1.replace("\\D","");
        double sayi1=Double.parseDouble(str1);
        str2=str2.replace("\\D","");
        double sayi2=Double.parseDouble(str2);
            System.out.println("$"+(sayi2+sayi1)/100);


         //  Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin

        String isim2="adaadfl";
        String soyisim2="efgbç";
        if (soyisim2.length()<isim2.length()){
            System.out.println(isim2);
        }else
            System.out.println(soyisim2);
        System.out.println(soyisim2);

        //soru5
        String input = "safgdzggçg";
        if (!input.contains("a") && !input.contains("z"))
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        if (input.contains("a")) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
        }
        if (input.contains("Z")) {
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }

//soru5
        //Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
        String input3="deniz";
        System.out.println(input3.substring(4)+input3.substring(3,4)+input3.substring(2,3)
                +input3.substring(1,2)+input3.substring(0,1));
         /* Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
        "Sifre basari ile tanimlandi", sartlari saglamazsa "Islem basarisiz,Lutfen yeni bir
        sifre girin" yazdirin
                - Ilk harf buyuk harf olmali
                -Son harf kucuk harf olmali
                - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
          */
        System.out.println("lütfen şifrenizi giriniz");
        String sifre = scan.next();
        String ilkHarf = sifre.substring(0, 1);
        String ilksart = sifre.substring(0, 1).toUpperCase();
        String sonHarf = sifre.substring(sifre.length() - 1);
        String ikinciSart = sifre.substring(sifre.length() - 1).toLowerCase();
        if (sifre.length() > 7 && !sifre.contains(" ") && ilkHarf.equals(ilksart) && sonHarf.equals(ikinciSart)) {
            System.out.println("Sifre basari ile tanimlandi");

        } else {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin ");
        }
        String input1="ssbybbye";
        String buyukHarf=input1.substring(0,1).toUpperCase();
        String kucukHarf=input1.substring(input.length()-1).toLowerCase();
        if (input.startsWith(buyukHarf)&& input.endsWith(kucukHarf)&& !input1.contains(" ") && input1.length()>=8){
            System.out.println("sifreniz kaydedildi");
        }else{
            System.out.println("sartlara uygun bir sifre giriniz");
        }

        //7.soru
        System.out.println("lütfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("lütfen soyisminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("lütfen kartno giriniz");
        String kartNo = scan.nextLine();

        String isimilkharf = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        String soyisimi = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
        System.out.println(isimilkharf + " " + soyisimi);
        String kkIlk4 = kartNo.substring(0, 4) + kartNo.substring(4).replaceAll("\\w", "*");
        System.out.println(kkIlk4);




    }
}



