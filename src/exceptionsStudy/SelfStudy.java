package exceptionsStudy;

public class SelfStudy {
    public static void main(String[] args) {
        method2();
    }

    public static void method() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void method2(){
        int a=9,b=0;
        int c=0;
        try {
             c = a / b;
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(c);
        }catch (RuntimeException re){
            re.printStackTrace();
        }finally {
            System.out.println("Finally caught...");
        }


    }
}
