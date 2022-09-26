package day17_nestedForLoop;
import java.util.Scanner;
public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen input'a gore *'lardan olusan bir ucgen olusturun
        ornek input =4 ise
                 * //i=1
                 * * //i=2
                 * * * //i=3
                 * * * * //i=4
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen ucgenin kac satir olacagini girin");
        int input=scan.nextInt();
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) { //her i artığında j'nin eni artar.(genişler)
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
