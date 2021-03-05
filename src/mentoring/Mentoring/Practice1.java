package mentoring.Mentoring;

public class Practice1 {
    public void additionMethod(int num){

       int sum=0;
       int temp=num;

       while (num>0){
           sum+=num%10;
           num=num/10;
       }
        System.out.println("The sum of the digits "+ temp+" is" + sum);

    }

    public static void main(String[] args) {
        Practice1 pr=new Practice1();
        pr.additionMethod(135);
    }
}

