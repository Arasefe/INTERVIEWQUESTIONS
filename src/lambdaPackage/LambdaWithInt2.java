package lambdaPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaWithInt2 {
    public LambdaWithInt2(){}

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

        // Create a method to print the squares of every odd element on the console in the same line  with a space between two consecutive
        //printSquare1(list);

        System.out.println(getSum4(list));
        System.out.println(getSum3(list));
        System.out.println(getMaxEl1(list));

    }
    // map() in stream() used to update the variable
    // 1st Way: By using lambda expression
    public static void printSquare1(List<Integer>list){
        list.stream().filter(p->p%2!=0).map(p->p*p).forEach(p-> System.out.println(p));
    }
    // 2st Way: By using method Reference
    public static void printSquare2(List<Integer>list){
        list.stream().filter(LambdaWithInt2::getOdd).map(LambdaWithInt2::getSquare).forEach(LambdaWithInt1::getPrint);
    }


    public static boolean getOdd(int x){
        return x%2!=0;
    }
    public static int getSquare(int x){
        return x*x;
    }

    /*
    Use Functional Programming
    3 Create a method to find the sum of the square of all odd elements in the given list
     */

    public static int getSum1(List<Integer>list) {
        int sum = 0;
        for (Integer each : list) {
            if (each % 2 != 0) {
                sum += each;
            }

        }
        return sum;
    }


    // Solve by using Functional programming
    public static int getSum2(List<Integer>list){
        return list.stream().filter(LambdaWithInt2::getOdd).map(LambdaWithInt2::getSquare).reduce(0,(x,y)->x+y);
    }


    public static Optional<Integer> getSum3(List<Integer>list){
        return list.stream().filter(LambdaWithInt2::getOdd).map(LambdaWithInt2::getSquare).reduce(Math::addExact);
    }

    public static Optional<Integer> getSum4(List<Integer>list){
        return list.stream().filter(LambdaWithInt2::getOdd).map(LambdaWithInt2::getSquare).reduce(Integer::sum);
    }


    /*
    Use Functional Programming
    Create a method to find the maximum value from the list
    1st Way By using lambda expression
     */

    public static Optional<Integer> getMaxEl1(List<Integer>list){
        return list.stream().reduce((x,y)->x>y?x:y);
    }

    /*
    Use Functional Programming
    Create a method to find the maximum value from the list
    2nd Way By using Method Reference, use Java methods in reduce()
     */

    public static Optional<Integer> getMaxEl2(List<Integer>list){
        return list.stream().reduce(Math::max);
    }

    public static Optional<Integer> getMaxEl3(List<Integer>list){
        return list.stream().reduce(Integer::max);
    }

    /*
    Use Functional Programming
    Create a method to find the maximum value by using sort()
    2nd Way By using Method Reference, use Java methods in reduce()
     */

    public static Optional<Integer> getMaxEl4(List<Integer>list){
        return list.stream().sorted().reduce((x,y)->y);
    }


    /*
    Use Functional Programming
    Create a method to find the minimum value by using sort()
    2nd Way By using Method Reference, use Java methods in reduce()
     */

    public static Optional<Integer> getMinEl1(List<Integer>list){
        return list.stream().sorted().reduce((x,y)->x);
    }

    public static Optional<Integer> getMinEl2(List<Integer>list){
        return list.stream().sorted().findFirst();
    }
    /*
    Use Functional Programming
    Create a method to print the squares of even list elements in reverse order
     */
    public static List<Integer> getEvenSquaresReverseSorted1(List<Integer>list){
        return list.stream().filter(LambdaWithInt1::getEven).map(LambdaWithInt2::getSquare).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }





}
















