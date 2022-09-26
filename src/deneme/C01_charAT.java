package deneme;

import com.sun.tools.javac.Main;

public class C01_charAT {
    public static void main(String[] args) {
        String str="java öğrenmek ne güzel";
        System.out.println((str.charAt(0)));
        System.out.println(str.toUpperCase().charAt(7));
        System.out.println(str.charAt(21));
        System.out.println(str.replaceAll("n","N"));
    }
}
