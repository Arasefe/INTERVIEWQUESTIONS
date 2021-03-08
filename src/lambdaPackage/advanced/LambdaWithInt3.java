package lambdaPackage.advanced;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaWithInt3 {
    public LambdaWithInt3() {
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(9);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(15);
        System.out.println(getOddSquaresRevSorted(list));
    }

    public static void printEvenListElFunctional1(List<Integer> list) {
        list.stream().filter((t) -> {
            return t % 2 == 0;
        }).forEach((t) -> {
            System.out.print(t + " ");
        });
    }

    public static void printEvenListElFunctional2(List<Integer> list) {
        Stream var10000 = list.stream().filter((t) -> {
            return t % 2 == 0;
        });
        PrintStream var10001 = System.out;
        var10000.forEach(var10001::print);
    }

    public static void printEvenListElFunctional3(List<Integer> list) {
        list.stream().filter((t) -> {
            return t % 2 == 0;
        }).forEach(LambdaWithInt3::getPrint);
    }

    public static void getPrint(int a) {
        System.out.print(a + " ");
    }

    public static void getSquare1(List<Integer> list) {
        list.stream().filter((t) -> {
            return t % 2 != 0;
        }).map((t) -> {
            return t * t;
        }).forEach((t) -> {
            System.out.print(t + " ");
        });
    }

    public static void getSquare2(List<Integer> list) {
        list.stream().filter(LambdaWithInt3::getOdds).map(LambdaWithInt3::getSquare).forEach(LambdaWithInt3::getPrint);
    }

    public static boolean getOdds(int a) {
        return a % 2 != 0;
    }

    public static int getSquare(int a) {
        return a * a;
    }

    public static int sumOfOdds1(List<Integer> list) {
        return (Integer)list.stream().filter(LambdaWithInt3::getOdds).map(LambdaWithInt3::getSquare).reduce(0, (x, y) -> {
            return x + y;
        });
    }

    public static Optional<Integer> sumOfOdds2(List<Integer> list) {
        return list.stream().filter(LambdaWithInt3::getOdds).map(LambdaWithInt3::getSquare).reduce(Integer::sum);
    }

    public static Optional<Integer> sumOfOdds3(List<Integer> list) {
        return list.stream().filter(LambdaWithInt3::getOdds).map(LambdaWithInt3::getSquare).reduce(Math::addExact);
    }

    public static Optional<Integer> sumOfOdds4(List<Integer> list) {
        return list.stream().filter(LambdaWithInt3::getOdds).map(LambdaWithInt3::getSquare).reduce(LambdaWithInt3::getSum);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static Optional<Integer> maxEl1(List<Integer> list) {
        return list.stream().reduce((x, y) -> {
            return x > y ? x : y;
        });
    }

    public static Optional<Integer> maxEl2(List<Integer> list) {
        return list.stream().reduce(Integer::max);
    }

    public static Optional<Integer> maxEl3(List<Integer> list) {
        return list.stream().reduce(Math::max);
    }

    public static Optional<Integer> maxEl4(List<Integer> list) {
        return list.stream().reduce(LambdaWithInt3::getMax);
    }

    public static int getMax(int x, int y) {
        return x > y ? x : y;
    }

    public static Optional<Integer> maxEl5(List<Integer> list) {
        return list.stream().sorted().reduce((x, y) -> {
            return y;
        });
    }

    public static Optional<Integer> maxEl6(List<Integer> list) {
        return list.stream().sorted().reduce((x, y) -> {
            return x;
        });
    }

    public static List<Integer> getOddSquaresSorted(List<Integer> list) {
        return (List)list.stream().filter(LambdaWithInt3::getOdds).distinct().map(LambdaWithInt3::getSquare).sorted().collect(Collectors.toList());
    }

    public static List<Integer> getOddSquaresRevSorted(List<Integer> list) {
        return (List)list.stream().filter(LambdaWithInt3::getOdds).distinct().map(LambdaWithInt3::getSquare).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
