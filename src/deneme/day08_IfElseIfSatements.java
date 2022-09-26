package deneme;

import java.util.Scanner;

public class day08_IfElseIfSatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen geçerli bir gün ismi giriniz");
        String gun=scan.nextLine().toLowerCase();
        if (gun.equals("pazartesi")){
            System.out.println("paz");
        }else if (gun.equals("salı")){
            System.out.println("sal");
        }else if (gun.equals("carsamba")){
            System.out.println("sal");
        }else if(gun.equals("car")){
            System.out.println("persembe");
        }else if(gun.equals("per")){
            System.out.println("cuma");
        }else if(gun.equals("cum")){
            System.out.println("cumartesi");
        }else if(gun.equals("cum")){
            System.out.println("pazar");
        }else if(gun.equals("paz")){
        }else
            System.out.println("lütfen geçerli bir gün ismi giriniz");


    }
}
