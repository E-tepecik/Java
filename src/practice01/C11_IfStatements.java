package practice01;

public class C11_IfStatements {
    /*
not hesaplayici
   A => 90 ~100
   B => 80 ~ 89
   C => 70 ~ 79
   D => 60 ~ 69
   F =>  0 ~ 59
 */
    public static void main(String[] args) {
        int not=85;
        boolean a=(not<=100 && not>=90);
        System.out.println("A");
        boolean A=(not<=90 && not>=80);
        System.out.println("B");
        boolean B=(not<=79 && not>=70);
        System.out.println("C");
        boolean C=(not<=69 && not>=60);
        System.out.println("D");
        boolean D=(not<=59 && not>=0);
        System.out.println("F");
    }
}
