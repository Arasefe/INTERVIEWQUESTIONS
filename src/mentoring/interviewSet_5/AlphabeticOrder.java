package mentoring.interviewSet_5;

public class AlphabeticOrder {
    // Write a program that will print out letters in the alphabetic order from A to Z
    // and do it for 5 times

    public static void main(String[] args) {
        //alphabeticOrder1();
        alphabeticOrder2();
    }

    public static void alphabeticOrder1(){
        for (int i = 0; i < 5; i++) {
            for (char j = 65; j <90 ; j++) {
                System.out.print (j+" ");
            }
            System.out.println();
        }
    }

    public static void alphabeticOrder2(){
        int count=0;
        while(true){
            for (char i = 65; i <90 ; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
            count++;
            if(count==5){
                break;
            }
        }
    }

}
