package cybertek_interviewPrep;

public class _22Factorial {
    public static void main(String[] args) {
        System.out.println(factorial1(6));
        System.out.println(factorial2(6));
    }
    public static long factorial1(int number){
        if(number==0){
            return 1;
        }
        int factorial=1;
        for (int i = number;i>=1; i--) {
            factorial*=i;
        }
        return factorial;
    }

    public static long factorial2(int number){
        if(number==0){
            return 1;
        }
        return number*factorial2(number-1);
    }

    public static int factorial3(int num){
        int factorial=1;
        for(int i=num;i>=1;i--){
            factorial*=i;                                          // 6 30 120 360 720

        }
        return factorial;
    }


    public static  int factorial4(int num){
        if(num==1){
            return num;
        }
        return num*factorial4(num-1);

    }
}
