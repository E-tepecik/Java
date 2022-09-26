package day15_overloading_forLoop;

public class faktöriyel {
    public static void main(String[] args) {
         /*
          input olarak verilen bir tamsayi icin faktoryel hesaplayip yazdiran
           bir method olusturun
           verilen sayi negatif veya 20'den buyuk olursa
           "girilen sayinin faktoryeli hesaplanamaz"
           uyarisi yazdirin
         */
        int input=5;

        faktoriyel(input);
    }

    private static void faktoriyel(int input) {
         for (int i=input; i<20;i++){
             if (input<=0 ||input>20 ){
                 System.out.println("verilen sayının faktöriyeli hesaplanamaz");
             }else if (input==0){
                 System.out.println(1);

             }

         }

    }
}
