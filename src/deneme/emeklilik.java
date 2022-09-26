package deneme;

import java.util.Scanner;

public class emeklilik {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz");
        char cinsiyet= scan.next().toUpperCase().charAt(0);
        System.out.println("lütfen yaşınızı giriniz");
        double yas=scan.nextDouble();


        if (cinsiyet=='K') {
            if (yas<0 || yas>80) {
                System.out.println("geçerli yaş giriniz");
            } else if (yas<60) {
                System.out.println("emekli olamazsınız");

            } else {
                System.out.println("emekli olabilirsiniz");


            }

        } else if (cinsiyet=='E') {
            if (yas<0 || yas>80) {
                System.out.println("geçerli yaş giriniz");
            } else if (yas<65) {
                System.out.println("emekli olamazsınız");

            } else  {
                System.out.println("emekli olabilirsiniz");


            }

        }else {
            System.out.println("lütfen geçerli bir cinsiyet giriniz");
        }


    }
}
