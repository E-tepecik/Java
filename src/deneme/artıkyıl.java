package deneme;

import java.util.Scanner;

public class artıkyıl {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yıl giriniz");
        int yil=scan.nextInt();
     if (yil%4 != 0){
         if (yil%100 !=0){
             System.out.println("artık yıldır");
         } else if (yil%100 ==0) {
             if (yil%400==0){
                 System.out.println("artık yıl");
             }else {
                 System.out.println("artık yıl değildir");
             }

     }else {


         }
     }


    }
}
