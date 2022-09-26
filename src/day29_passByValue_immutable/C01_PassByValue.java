package day29_passByValue_immutable;
import java.util.Arrays;
import java.util.Random;
public class C01_PassByValue {
    public static void main(String[] args) {
        /*
          4 elemanli bir array olusturalim
          sonra ayri bir method'da
          bu array'in 2. ve 4. elemanlarini
          100'den kucuk rastgele bir sayi ile degistirelim
          ve yeni halini yazdiralim
         */
         //int[] sayilar={1,2,3,4};//benim yaptığım
        //degistir(sayilar);

       int[] arr={5,7,8,10};
        System.out.println("değişmeden önce referans değeri "+arr);//anlamak için ekledim
       elemanDegistir(arr);
       System.out.println("main method'un icinde diger method calistiktan sonra : " + Arrays.toString(arr));
       //Ancak array veya list degistirilmeden sadece icindeki elemanlar degistirilirse
        //Java obje degismedigi icin(referans ayni) ayni array veya list'i bize dondurur
        //ancak icindeki elementler degismis olacaktir.
        System.out.println("değiştikten sonra referans değeri aynı kalır "+arr);
   }
   public static void elemanDegistir(int[] arr) {
       Random rnd=new Random();
       arr[1]=rnd.nextInt(100);
       arr[3]=rnd.nextInt(100);
       System.out.println("Method'un icinde : " + Arrays.toString(arr)); // [5, 29, 8, 13]

    }

 // private static void degistir(int[] sayilar) {
 //     sayilar[1]=(int)(Math.random()*100);
 //     sayilar[3]=(int)(Math.random()*100);
 //     System.out.println(Arrays.toString(sayilar));
 // }
}
