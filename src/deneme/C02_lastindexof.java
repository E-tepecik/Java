package deneme;

public class C02_lastindexof {
    public static void main(String[] args) {
        /* verilen kelime icin asagidaki sartlardan uygun olani yazan bir program yaziniz
           - verilen kelime cumlede kullanilmamis
           - verilen kelime cumlede sadece 1 kere kullanilmis
           - verilen kelime cumlede birden fazla kullanilmis
         */
        String cumle="gün gelir devran döner";
        String kelime="gel";
        int ilkkelime=cumle.indexOf(kelime);
        int sonkelime=cumle.lastIndexOf(kelime,ilkkelime+1);
        if (ilkkelime==-1){
            System.out.println("verilen kelime cumlede kullanilmamis");
        } else if (ilkkelime==sonkelime) {
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");
        }else {
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");
        }


    }
}
