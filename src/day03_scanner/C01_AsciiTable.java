package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        int sayi=10;
        char harf='a';
        String str="banan";
        System.out.println(sayi+harf);//10a değil 107 oldu
        System.out.println(sayi*harf); //970
        System.out.println(str+harf);// banana
        System.out.println(harf+2);//99
        System.out.println(str+sayi);//banana10
        System.out.println(str+sayi+harf); //banan10a matematite soldan işlem yapıldığı için sıralama bu şekildedir.
        char deger =1;
        System.out.println(deger+harf);//'1'+'a'--->146 1'in ve a'nın asci tablodaki değerlerini toplar.
        // char yeniHarf=harf+2;
        /* 1-)char data türü işleme girdiği değişkenin türüne göre farklı davranabilir.
        eğer matematiksel işleme girdiği variable sayisal bir değerse sayı gibi davranır.
        sayi+harf sayi variable'i int olduğundan harf variable'ı asci tablodan 97 değerini kullanır.



        2-char yeniHarf=harf+2 java önce sağdaki işlemi yapar sağda
        int + char görünce asccii değerini sonra atama işlemini yapmaya çalışır.
        char yeniHarf=99; değeri sağdaki değer int olduğu için hata verir. bu atama cava açısından kabul edilebilir değildir.
        3-)str+harf // banana String variable çok güçlüdür. hangi data türü ile işleme girerse girsin diğer data türünü kendine benzetir.
        4-) peki... konsolda 10a görmek istersek nasıl yazdırmalıyız
         */
        System.out.println(""+sayi+harf);//10a
        System.out.println("10a");//bu şekilde de olur fakat variable kulanarak yukarıdaki gibi olur.49+97=146


    }
}
