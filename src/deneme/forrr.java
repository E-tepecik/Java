package deneme;

public class forrr {
    public static void main(String[] args) {


        String cumle = "java öğrenmek çok kolay";
        for (int i = 1; i < 10; i++) {
            System.out.println(cumle);
        }

        for (int i = 10; i <= 30; i++) {
            if (i < 30) {
                System.out.print(i + ",");
            } else {
                System.out.println(i);

            }

        }
        for (int i =100; i>=50;i--){

            if (i >50) {
                System.out.print(i + ",");
            } else {
                System.out.println(i);

            }
        }
        int sayı=50;
        if (sayı<100 && sayı>0){
            for (int i=1; i<=sayı; i++){
                if (i%3==0){
                    System.out.print(i+",");
                }
            }

        }


    }
}