package lambdaPackage.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LambdaWithInt1 {
    public LambdaWithInt1(){}

    public static void main(String[] args) {
        // Arrays.asList(); Converts Array to ArrayList
        List<Integer> list = new ArrayList(Arrays.asList(12,9,13,4,9,2,4,12,15));
//        list.add(12);
//        list.add(9);
//        list.add(13);
//        list.add(4);
//        list.add(9);
//        list.add(2);
//        list.add(4);
//        list.add(12);
//        list.add(15);

//        getEvenNumbers1(list);
//        getEvenNumbers2(list);
//        getEvenNumbers3(list);
        getEvenNumbers4(list);

    }

    public static void getEvenNumbers1(List<Integer>list){       //Structured
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2==0){
                System.out.print(list.get(i)+" ");
            }
        }
        System.out.println();
    }
    // First way of functional programming
    public static void getEvenNumbers2(List<Integer>list){      // Functional
        list.stream().filter(p->p%2==0).forEach(p-> System.out.print(p+" "));
        System.out.println();
    }

    // Second way of "Method reference"
    // Method Reference==>Class Name :: Method Name
    public static void getEvenNumbers3(List<Integer>list){      // Functional
        list.stream().filter(p->p%2==0).forEach(System.out::print);
        System.out.println();
    }


    public static void getEvenNumbers4(List<Integer>list){      // Functional
        list.stream().filter(LambdaWithInt1::getEven).forEach(LambdaWithInt1::getPrint);
        System.out.println();
    }

    public static void getPrint(int x){
        System.out.print(x+" ");
    }

    public static boolean getEven(int x){
        return x%2==0;
    }
}
