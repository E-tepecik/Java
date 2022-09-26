package deneme;

import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=scan.next();
        for (int i=kelime.length()-1; i>=0; i--){
            System.out.print(kelime.substring(i,i+1));
        }

    }
}
