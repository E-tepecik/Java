package deneme;

import java.util.Scanner;

public class Nested_Ternary {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir not giriniz");
        int not = scan.nextInt();
        System.out.println(not<10? "rakam" : (not<100)? "iki basamaklı":"üç basamaklı");
    }
}