package PrimitiveDataTypes;

public class StarTree {


    public static void main(String[] args) {
        starTree1();
    }

    public static void starTree1(){
        for(int i=1;i<6;i++){
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void starTree2(){
        for (int i = 1; i <5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("* ");
            }
            System.out.println("");
        }
    }
}
