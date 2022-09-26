package deneme;

public class yarıs {
    /*Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
 ardından döngüleri kullanarak
 karakterin isimde kaç kez tekrarlandığını kontrol edin.

ornek:

char karakter = 'a' ;
String isim ="afra"
output: karakter isimde 2 kere tekrarlanmistir
 */
    public static void main(String[] args) {

        String isim = "bayraaaam";
        String karakter = "a";
        int kackez = 0;
        for (int i =isim.length()-1; i >= 0; i--) {
            boolean esit = karakter.equals(isim.substring(i,i+1));
            if (esit == true) {
                kackez += 1;
            }
        }
        System.out.println(kackez);


    }}

