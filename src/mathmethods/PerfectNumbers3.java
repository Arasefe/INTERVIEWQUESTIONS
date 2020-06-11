package mathmethods;

public class PerfectNumbers3 {
    public static boolean perfectMethod(int num){

            int div=1;
            int sum=0;
            do{
                if(num%div==0){
                    sum+=div;
                }
                div++;

            }while(div<num);
            if (sum==num) {
                System.out.println(true);
                System.out.println(div);
            }else{
                System.out.println(false);
            }
            return true;
        }

    public static void main(String[] args) {
        perfectMethod(6);
    }
}
