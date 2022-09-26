package day17_nestedForLoop;
public class C01_ForLoop {
    public static void main(String[] args) {
        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdirip
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz
        String input = "taka tuka";
        tekrarsizYap(input);
    }
    public static void tekrarsizYap(String input) {
        String benzersizInput="";//variable forun içerisinde oluşturursak dışında kullanamayız(esra)
        String islenecekKelime=input.replaceAll("\\W",""); // EmsalEfe
        System.out.print(islenecekKelime.substring(0,1)); // E//(esra)print yaptık aşaıdaki yazdırdığımız kısımı yanına yazdırsın diye
        benzersizInput+=islenecekKelime.substring(0,1);  // E//ilk harfi burada aldık çünkü virgül sonda fazla kalmasın diye
        for (int i = 1; i <islenecekKelime.length() ; i++) {//<=yapmak isterseklength-1 alabiliriz
            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+ islenecekKelime.substring(i,i+1));//yukarıdaki yazdırma kısmına ekliyoruz
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }
        System.out.println("");//durdurmak için aldık
        System.out.println("inpt: " + input);
        System.out.println("benzersiz input : " + benzersizInput);
    }
}