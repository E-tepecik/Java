package day16_ForLoop;

import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sözcük giriniz");
        String sozcuk = scan.next();
        if (sozcuk.length()%2==1 && sozcuk.length()>=3) {
            System.out.println(sozcuk.charAt(sozcuk.length() / 2));
        }
    }
}
