package day15_overloading_forLoop;

public class C06_StringTerseCevirme2 {
    public static void main(String[] args) {
        //input olarak verilen String'i terse cevirip yazdiran bir method olusturun
        String input="hasan";
        //sadece yazdircak o zamn void
        terstenYazdir(input);
    }
    public static void terstenYazdir(String input) {
        /*String tersInput=input.substring(input.length()-1);//once son harfi hallediyoruz
                                                                 // bir aralikta olmadigi icin
        for (int i =input.length()-2 ; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);
        }
        System.out.println(tersInput);
         */
        String tersInput="";
        for (int i =input.length()-1 ; i >=0 ; i--) {

            tersInput+=input.substring(i,i+1);
        }
        System.out.println(tersInput);
    }
}

