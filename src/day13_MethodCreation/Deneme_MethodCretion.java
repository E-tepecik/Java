package day13_MethodCreation;

public class Deneme_MethodCretion {
    public static void main(String[] args) {

        topla();//eğer methodu argüment eklemeden oluşturursak farklı bir classtan çağırdığımızda
        //yeni argümen ekleyemeyiz ve hep oluşturduğumuz methodaki sonucu veririr
    }
    public static void topla() {

        int input1=30;
        int input2=20;
        System.out.println("Girilen iki sayinin toplami : "+ (input2+input1));
    }
}


