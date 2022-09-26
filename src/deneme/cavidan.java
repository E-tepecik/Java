package deneme;

import java.util.Scanner;

public class cavidan {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //Soru4 Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.
        //Kullanici S girerse “Software”
        //D girerse “Developer”
        //E girerse “Engineer”
        //T girerse “InTesting” yazdirin
        System.out.println("\n\naçılımını ögrenmek istediğiniz harfi giriniz (S/D/E/T)");
        //char harf=scan.nextChar().toUpperCase(); KABUL ETMİYOR ANLAYAMADIM
        char harf = scan.next().toUpperCase().charAt(0);
        switch (harf) {
            case 'S':
                System.out.print("Software");
                break;
            case 'D':
                System.out.print("Developer");
                break;
            case 'E':
                System.out.print("Engineer");
                break;
            case 'T':
                System.out.print("InTesting");
                break;
            default:
                System.out.println("S/D/E/T harflerinden birini giriniz");
        }

    }
}