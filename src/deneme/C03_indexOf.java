package deneme;

public class C03_indexOf {
    public static void main(String[] args) {


    String cumle="wertyuio;lsdfgpoiuytrwsdfghjklp0oiuytwsdfghjkliuytrsdfghjk";
    int ilky=cumle.indexOf("y");
    int ikinciy=cumle.indexOf("y",ilky+1);
    if (ilky==-1){
        System.out.println("hiç y yok");

    }else if (ilky==ikinciy){
        System.out.println("bir y var");

    }else {
        int ucuncuy=cumle.indexOf("y",ikinciy+1);
        System.out.println("ucuncuy = " + ucuncuy);
    }
}
}