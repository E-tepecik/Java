package day27_staticKeyword;

public class Rope {
    public static void swing() {
        System.out.println("swing");
    }

    public void climb() {
        System.out.println("climb");
    }

    public static void play() {
        swing();
        //  climb(); cagiramazsin cunku statik degil
    }

    public static void main(String[] args) {
        Rope rope = new Rope();
        rope.play();
        Rope rope2 = null;//bu obje ile sadece method cagirabiliriz atama yapamayiz cunku constructor yok
        rope2.play();
    }
}