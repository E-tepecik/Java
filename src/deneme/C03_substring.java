package deneme;

public class C03_substring {
    public static void main(String[] args) {
        String isim= "suleyman";
        String soyisim= "Karanfil";
        String kartNo= "1234 6589 7458 9658";
        System.out.println(isim.substring(3));
        System.out.println(isim.substring(3,5));
        System.out.println(isim.substring(0,1).toUpperCase());
        System.out.println(isim.substring(1,2));
        String isimilkharf=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        String soyisimi=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isimilkharf+" "+soyisimi);
        String kkIlk4=kartNo.substring(0,4)+kartNo.substring(6).replaceAll("\\w","*");
        System.out.println(kkIlk4);
    }


}
