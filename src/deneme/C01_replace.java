package deneme;

public class C01_replace {
    public static void main(String[] args) {
        String str="bu gun ha va çok gu zel";
        System.out.println(str.replace("h","j").replace(" ",""));
        System.out.println(str.replace("guz el","harika"));
        str=str.replace("bu gun","bugun")
                .replace("ha va","java")
                .replace("gu zel","guzel");
        System.out.println(str);
    }
}
