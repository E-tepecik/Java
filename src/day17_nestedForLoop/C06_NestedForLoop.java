package day17_nestedForLoop;
public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen string'i asagidaki gibi yazdiran bir program yazalim
        input= Deniz
        D
        De
        Den
        Deni
        Deniz
        Deni
        Den
        De
        D
         */
        String input = "Deniz";
        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j));  // ilk harf icin substring(0,1) olmali
            }
            System.out.println("");

        }
        for (int i =input.length()-1; i>=1; i--) {
            for (int j =0; i>j ; j++) {
                System.out.print(input.substring(1 , j+1));
            }
            System.out.println("");
            }

        }
        


    }

