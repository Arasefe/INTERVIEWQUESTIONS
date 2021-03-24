package lambdaPackage.basics;

import java.util.function.Function;

public class CreateMultiplier {
    public static Function<Integer, Integer>createMultiplier(Integer y){
        return (Integer x)->x*y;
    }

    public static void main(String[] args) {

    }
}
