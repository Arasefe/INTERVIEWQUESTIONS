package lambdaPackage.basics;

import java.util.function.Function;

class LambdaWithInt5 {

    protected static class MyMath{
        public static Integer triple(Integer x){
            return x*3;
        }
    }

    public static void main(String[] args) {
        Function<Integer, Integer>myTriple=MyMath::triple;
        Integer result=myTriple.apply(7);
        System.out.println(result);

        Function<Double, Double>square=SecondMath::square;
        Double result2=square.apply(12.89);
        System.out.println(result2);
    }
}
class SecondMath{
    public static Double square(double x){
        return x*x;
    }
}