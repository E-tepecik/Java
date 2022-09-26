package deneme;

import java.util.Scanner;

public class bölme_cift {
    public static void main(String[] args) {


         /*
    Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
    Kullanicidan bir sifre girmesini isteyin
    Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin.
    Ilk harf A ise  “Gecerli Sifre”     degilse “Gecersiz Sifre” yazdirin.
    Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin.
    Ilk harf z ise  “Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
     */
    // ilk harf buyuk mu kucuk mu ?
    // ilk harf A veya z mi ?
    Scanner scan=new Scanner(System.in);
        System.out.println("lütfen sifrenizi giriniz");
        String sifre=scan.nextLine();
        char ilkHarf=sifre.charAt(0);

        if ('A'<=ilkHarf && ilkHarf<='Z'){
            if ('A'==ilkHarf) {
                System.out.println("Gecerli Sifre");
            }else{
                System.out.println("Geçersiz sifre");
            }

        }else if ('a'<=ilkHarf && 'z'<=ilkHarf){
            if ('z'==ilkHarf) {
                System.out.println("gecerli Sifre");
            }else {
                System.out.println("geçersiz şifre");
            }

        }else {
            System.out.println("lütfen geçerli bir sifre giriniz");
        }


    }


}
