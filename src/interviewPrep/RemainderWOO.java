package interviewPrep;

public class RemainderWOO {
    public static void main(String[] args) {
        System.out.println(remainderWithOutOperator1(10, 3));
    }

    public static int remainderWithOutOperator1(int number, int divisor) {
        if (number < divisor) {
            return number;
        }
        return number - divisor * (number / divisor);
    }


    public static int remainderWithOutOperator2(int number, int divisor) {
        if (number < divisor) return number;
        return number - divisor * (number - divisor);
    }
}

