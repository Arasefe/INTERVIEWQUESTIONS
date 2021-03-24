package lambdaPackage.basics;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HigherOrderFunctions {
    public static void main(String[] args) {
        BiFunction<Float, Float, Float> divide=(x,y)->x/y;

        Function<BiFunction<Float,Float,Float>,BiFunction<Float,Float,Float>>secondArgIsntZeroCheck=
                (func)->(x,y)->{
                    if(y==0f){
                        throw new ArithmeticException("divide by zero");

                    }
                    return func.apply(x,y);
                };
        BiFunction<Float,Float,Float>divideSafe=secondArgIsntZeroCheck.apply(divide);
        System.out.println(divideSafe.apply(10f,0f));


    }
}
