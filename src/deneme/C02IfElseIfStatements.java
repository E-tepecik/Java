package deneme;

import java.util.Scanner;

public class C02IfElseIfStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen notunuzu girin");
        double not1=scan.nextDouble();
        if (not1<0 && not1>100) {
            System.out.println("lütfen geçerli bir not giriniz");
        }else if (not1<=50) {
            System.out.println("d");

        } else if (not1>50 && not1<60) {
            System.out.println("c");
        }else if (60<not1 && not1<80){
        System.out.println("b");

        }else  {
            System.out.println("a");

        }
    }
}