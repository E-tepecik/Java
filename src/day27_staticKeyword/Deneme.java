package day27_staticKeyword;

public class Deneme {
    int x;//instance variable
    static int y;//static variable

    Deneme(int i) {//scope'ta x ve y değeri yok bu nedenle yukarıdaki instance(x) ve static(y) variable'ındaki değerini alır.2 artırır
        x += i;//0+2=2//2. adımda burası 3//instance olduğu için her objede en baştaki değerini alır.
        y += i;//0+2=2//2. adımda burası 2+3=5//static olduğu için değişen değerle yoluna devam eder
    }
    public static void main(String[] args) {
        new Deneme(2);//burada objenin ismi yazılmadığı için yazdırma veya herhangi bir işlem yapamayız.Ama constructorı çalıştırdığından static variable da kalıcı bir değer ataması yapmış olur.
        Deneme dnm=new Deneme(3);
        System.out.println(dnm.x+","+dnm.y);//3,5
    }
}
