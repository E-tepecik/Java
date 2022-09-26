package deneme;

import java.util.Scanner;

public class C06_IfElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
        int yas= scan.nextInt();

        if (yas<0) {
            System.out.println("lütfen geçerli bir yaş giriniz");
        }else if (yas<65){
            System.out.println("emekli olamazsınız "+ (65-yas)+" yıl daha çalışmanız gerekir");
        }
        else {
            System.out.println("emekli olabilirsiniz");

        }
    }
}
