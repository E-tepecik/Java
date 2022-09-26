package deneme;

public class method {
    public static void main(String[] args) {
        // input olarak verilen 4 harfli bir stringi
        // tersten yazdiran bir method olusturalim
        String isim="veli";
        tersinput(isim);

    }

    public static void tersinput(String isim) {

        String isimson=isim.substring(isim.length()-1)+isim.substring(isim.length()-2,isim.length()-1)+isim.substring(isim.length()-3,isim.length()-2)+
                isim.substring(isim.length()-4,isim.length()-3);
        System.out.println(isimson);
    }

}
