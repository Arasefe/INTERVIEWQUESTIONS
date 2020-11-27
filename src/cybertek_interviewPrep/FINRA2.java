package cybertek_interviewPrep;

public class FINRA2 {
    public static void main(String[] args) {
        finRa(30);
        finRa2(30);
    }

    public static void finRa(int boundary) {
        for (int i = 1; i <= boundary; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(i +" ");
            }
        }
        System.out.println();
    }

    public static void finRa2(int boundary){

        for (int i = 1; i <=boundary; i++) {
            System.out.print((i%3==0&&i%5==0)?"FINRA ":(i%3==0)?"FIN ":(i%5==0)?"RA ": String.valueOf(i)+" ");
        }
    }
}
