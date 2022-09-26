package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplamid {
    public static void main(String[] args) {


        //kull
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı pozitif bir tamsayi giriniz ");
        int sayi = scan.nextInt();
        int birlerBasamağı = 0;
        int rakamlarToplamı = 0;
        birlerBasamağı = sayi % 10;
        rakamlarToplamı += birlerBasamağı;
        sayi /= 10;
        birlerBasamağı = sayi % 10; //6
        rakamlarToplamı+=birlerBasamağı;//7+6=13
        sayi/=10;
        //suanda sayi 52 bb 6 rt 13
        

    }
}