package day27_staticKeyword;

public class OCA_2_Asama {

    public static void main(String[] args) {
        OCA_1_Asama b1 =new OCA_1_Asama(5);
        OCA_1_Asama []ba=go(b1,new OCA_1_Asama((6)));
        ba[0]=b1;
        for(OCA_1_Asama b:ba) System.out.print(b.size+"");
    }
    static OCA_1_Asama[]go (OCA_1_Asama b1,OCA_1_Asama b2){
        b1.size=4;
        OCA_1_Asama []ma={b2,b1};
        return ma;


    }
}
