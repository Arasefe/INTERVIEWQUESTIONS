package interviewPrep;

public class NumberFormat {
    public static void main(String[] args) {
        numberFormat1();
        //numberFormat2(93493349);
        //numberFormat3(93493349);
    }

    public static void numberFormat1() {
        System.out.printf("%,d\n",32231349);
        System.out.printf("%,.2f\n",32231349.45);
        System.out.printf("%,.2f\n",32231349.6);
    }




    public static void numberFormat2(long num){
        System.out.printf("%,d\n",num);


    }
    public static void numberFormat3(float num){
        System.out.printf("%,.2f\n",num);
        System.out.printf("%,.2f\n",num);

    }

    // long number=7329239892
    // 73,292,39

    public static void numberFormat3(long num){
        System.out.printf("%,d\n",num);
    }

}
