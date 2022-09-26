package deneme;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("2 sayı");
        int sayi= scan.nextInt();
        int sayi1=scan.nextInt();

         if (sayi>0 && sayi1>0){
             System.out.println(sayi1+sayi);
         }else if(sayi<0 &&sayi1<0) {
             System.out.println(sayi * sayi1);
         } else if ((sayi>0 && sayi1<0) || (sayi<0 && sayi1>0)) {
             System.out.println("farklı işaretlerle işlem yapılamaz");
             
         }else {
             System.out.println("sıfır çarpmaya göre yutan elemandır");
         }

    }
         
         
}
