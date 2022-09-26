package deneme;

public class ebob_ekok {
    public static void main(String[] args) {
        /*Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
        Input :
        30
        40
        Beklenen Cikti:
        30 ve 40 icin GCD = 10
        30 ve 40 icin LCM = 120*/


        int sayı1 = 20;
        int sayı2 = 8;
        String sayı1Kalan = "";
        int sayı1çarpan = 0;
        for (int i = 2; i <=20; i++) {

            if (sayı1 % i == 0) {
                sayı1Kalan+=","+sayı1/i;
                System.out.println(sayı1Kalan);
            }


        }

    }
}