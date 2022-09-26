package deneme;

public class C01_indexOf {
    public static void main(String[] args) {

/* verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
           - verilen kelime cumlede kullanilmamis
           - verilen kelime cumlede sadece 1 kere kullanilmis
           - verilen kelime cumlede birden fazla kullanilmis
         */
        String cumle = "hayatın amacı keşfetmektir";
        String kelime="fet";
        int kelimeİlkindex=cumle.indexOf(kelime);
        int kelimeSonindex=cumle.lastIndexOf(kelime);
        if (kelimeİlkindex==-1){
            System.out.println("kelime cümlede kullanılmamıştır");
        } else if (kelimeİlkindex==kelimeSonindex) {
            System.out.println("1. kez kullanılmıştır");

        }else {
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");
        }


    }
}