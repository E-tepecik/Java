package day04_dataCasting;

public class C04_ExplicitNarrowingd {
    public static void main(String[] args) {
        int sayi1=50;
        byte sayi2=(byte)sayi1;
        System.out.println(sayi2);//50

        /* geniş data türündeki
        değeri, dar data türündeki variable'a atamak isterseniz
        java sizin geniş data türündeki değerin dar data türünün sınırlarına uyup uymayacağını çalıştırına kadar bilemez
        ama java risk almaz riski sıfıra indirmek için burada bir sorun olursa sorumluluğu kabul etmenizi bekler bunun için değerin önüne parantez içerisinde istediğimiz data türünü
        yazmanız yeterlidir
        bu riski üstlendiğimizde 3 durum oluşabilir.
        1- izim değerimiz dar kalıp değerlerine uygun olıursa hiç bir kayıpolmadan cast olur
        2-double bir sayiyi int'a cast etmek gibi durumlarda dta kaybı yaşayabilirsiniz
        3-geniş kalıptan değeri dar kalıba koyduğunuzda sırıları aşan durumlarda veri başklaşabilir
         */
    }
}
