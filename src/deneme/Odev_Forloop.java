package deneme;

public class Odev_Forloop {
    public static void main(String[] args) {
        String sozcuk="adam";
        String tersi="";
        for (int i=sozcuk.length()-1;i>=0; i--){
            tersi+=sozcuk.substring(i,i+1);
        }
        System.out.println(tersi);
        if (tersi.equals(sozcuk)){
            System.out.println("palindrome");
        }else {
            System.out.println("değildir");
        }
    }
}
