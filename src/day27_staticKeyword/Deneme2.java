package day27_staticKeyword;

public class Deneme2 {
    static int count=0;
    public void increment(){
        count++;
    }

    public static void main(String[] args) {
        Deneme2 obje1=new Deneme2();//count burda 1 burda sout yapsaydik 1 ciakrrdi
                                    //ama asagida en son degeri ne ise onu yazdirir
        Deneme2 obje2=new Deneme2();
        obje1.increment();
        obje2.increment();
        System.out.println("Obje1 count is= "+obje1.count);//obje ile cagirmasak da olur count zaten static bir variable
        System.out.println("Obje2 count is= "+obje2.count);
    }}