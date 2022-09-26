package day18_while_doWhileLoop;
public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.
         */
        char ilkHarf='f';
        char sonHarf='t';
        char temp=ilkHarf;
        String buyult="";
        while(temp<=sonHarf){
            buyult=(temp+"").toUpperCase();//(esra)buyult+=yaptığımızda atama yaptğımız ve soutun döngü içerisinde olmasından
            System.out.print(buyult + " ");//(esra)dolayı her atamayı birçok kez yazdırıyor.sout'u döngü dışında yazdırırsak atama yapabiliriz.
            temp+=1;
        }
    }
}