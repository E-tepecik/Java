package deneme;

import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("teklifi giriniz");
        int maas= scan.nextInt();
        if (800<maas){
            System.out.println("kabul");

        }else if (maas<800 &&maas>600 ){
            System.out.println("konuşabiliriz");
        }else {
            System.out.println("maalesef başka kapıya");
        }

    }
}
