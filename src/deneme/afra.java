package deneme;

public class afra {
    public static void main(String[] args) {
        String isim ="aaa";
        char bir = isim.charAt(0);
        char iki = isim.charAt(1);
        char uc = isim.charAt(2);
        System.out.println((isim.length() ==3)?
                "uc harfli isim girin" : (isim.indexOf(isim.charAt(0),bir+1)==-1 && isim.indexOf(isim.charAt(0),bir+2)==-1 && isim.indexOf(isim.charAt(1),bir+2)==-1 ) ?
                "isim ayni karakterlere sahiptir.":"Dizenin benzersiz karakterleri var");
        System.out.println(isim.indexOf(isim.charAt(0),bir+1)==-1);
    }
}
