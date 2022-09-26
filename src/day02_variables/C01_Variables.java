package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {
        int                           not           =                           60          ;
     // data turu               variable ismi       assigment sign       variable değeri   işlem bitti işareti

        int      not2       =            70;
     //veriable                       değer
     //java once değeri hesaplar sonra assign işlemi yapar

        not2=90; //başına int(data türünü yazıp tekrar) aynı isme değer atanmıyor tekrar değer atamak yapmak istiyorsan buşekilde dene
     // yeni bir int variable oluşturalım değeri ilk iki variablenin ortalaması olsun
        int ort=(not+ not2)/2;

        System.out.println(ort);
        // "" icinde yazılan hersey metindir, java "" içine ne görürse o şekilde yazdırır
        // eger bir variablenin değerini yazdırmak istiyorsanız

    }
}
