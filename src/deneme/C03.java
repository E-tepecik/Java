package deneme;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz");

        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("lütfen yaşınızı giriniz");
        int yas=scan.nextInt();
        if (cinsiyet=='K') {
            if (yas < 0 || yas > 80)
                System.out.println("lütfen geçerli bir yaş giriniz");
        } else if (yas<60) {
            System.out.println("emekli olamazsın");


        } else  {
            System.out.println("emekli olabilirsin");

        }


        if (cinsiyet=='E') {
            if (yas < 0 || yas > 80)
                System.out.println("lütfen geçerli bir yaş giriniz");
        } else if (yas<65) {
            System.out.println("emekli olamazsın");


        } else  {
            System.out.println("emekli olabilirsin");

        }

     }

    }

