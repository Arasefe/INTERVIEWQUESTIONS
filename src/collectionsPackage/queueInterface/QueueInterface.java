package collectionsPackage.queueInterface;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
    public static void main(String[] args) {
        queueMethod1();
        queueMethod2();
        queueMethod3();
    }

    public static void queueMethod1(){
        //Allows duplicates and stores randomly
        Queue<Integer>queue=new PriorityQueue<>();
        queue.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("PriorityQueue"+queue);
        queue.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("PriorityQueue"+queue);
        queue.add(null);
        System.out.println("PriorityQueue"+queue);


    }

    public static void queueMethod2(){
        //Allows duplicates and stores randomly
        Queue<Integer>queue=new ArrayDeque<>();
        queue.addAll(Arrays.asList(5,4,3,2,1));
        System.out.println("PriorityQueue"+queue);
        queue.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println("PriorityQueue"+queue);
        queue.poll();
        System.out.println(queue);
    }

    public static void queueMethod3(){
        //Allows duplicates and stores randomly
        //Retains Insertion order
        Queue<String>queue=new ArrayDeque<>();
        queue.addAll(Arrays.asList("Aras", "Tulpar", "Aras", "Banu", "Ismail", "Tulpar"));
        System.out.println("PriorityQueue"+queue);
        queue.addAll(Arrays.asList("Aras", "Tulpar", "Aras", "Banu", "Ismail", "Tulpar"));
        System.out.println("PriorityQueue"+queue);
        queue.poll();
        System.out.println(queue);
        //Retrieves, but does not remove, the head of this queue
        queue.peek();
        System.out.println(queue);
    }


}
