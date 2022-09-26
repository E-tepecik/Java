package deneme;

public class forloop {
    // Soru 2 ) 10 ile 30 arasindaki(10 ve 30 dahil)
    // sayilari aralarinda virgul olarak ayni satirda yazdirin.
    public static void main(String[] args) {
        int sayı1=10;
        int sayı2=30;

        for (int i=sayı1; i<=sayı2; i++){

if (i<sayı2){
    System.out.print(i+",");

} else System.out.print(i);
        }

         /*
    Soru 6) Interview Question Kullanicidan 100’den kucuk bir tamsayi isteyin.
    1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
    Ancak;
        - Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        - Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        - Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.
     */

        int sayi=55;
        for (int i=1; i<=sayi; i++) {
            if (sayi < 100 && sayi > 0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print("Java Guzeldir"+" \n");
                } else if (i % 3 == 0) {
                    System.out.print("java"+" ");
                } else if (i % 5 == 0) {
                    System.out.print("Guzeldir"+" ");
                }else
                    System.out.print(i + " ");
            }

        }

         /*
        Soru 10 ) Kullanicidan iki sayi isteyin.
        Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        sonucu yazdiran bir method yaziniz
         */

        int bir=5; int iki=9; int toplam=0;

        for (int i=bir;i<=iki; i++){
            toplam+=i;

        }
        System.out.println("\n"+toplam);

    }

}
