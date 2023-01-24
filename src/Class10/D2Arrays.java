package Class10;

public class D2Arrays {
    public static void main(String[] args) {
        String[][] thomasTrain=new String[3][3];
        String[] cabin0={"Adem","Zafar","sam"};
        String[] cabin1={"Nabi","Saud","Anees"};
        String[] cabin2={"Safi","Abeera","Zahra"};

        thomasTrain[0]=cabin0;
        thomasTrain[1]=cabin1;
        thomasTrain[2]=cabin2;

        System.out.println(thomasTrain[1][1]);

    }
}
