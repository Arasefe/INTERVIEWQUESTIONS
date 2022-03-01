package lambdaPackage.advanced;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaGeneral {
    public static void main(String[] args) {
        MyTech trGunduz = new MyTech("Summer", "TR Daytime", 97, 124);
        MyTech engGunduz = new MyTech("Winter", "ENG Daytime", 95, 131);
        MyTech trGece = new MyTech("Spring", "TR Nighttime", 98, 143);
        MyTech engGece = new MyTech("Fall", "ENG Nighttime", 93, 151);

        List<MyTech> list = new ArrayList<>(Arrays.asList(trGunduz, engGunduz, trGece, engGece));


        System.out.println(batchAverageGreaterThan92(list));
        System.out.println();
        System.out.println("   ***   ");


    }

    //task 01--> create a method to check batchAverage gt 92
    public static boolean batchAverageGreaterThan92(List<MyTech> list) {
        return list.
                stream().
                allMatch(t -> t.getBatchAverage() > 92);

    }

    //task 02--> create a method that checks totalStudent is not less than 110
    public static boolean totalStudentNotLessThan110(List<MyTech> list) {
        return list.
                stream().
                // noneMatch(t -> t.getTotalStudent()< 110);
                        allMatch(t -> t.getTotalStudent() >= 110);
    }

    //task 03--> Create a method that checks if there is Spring in any Batches
    public static boolean checkIfSpringExists(List<MyTech> list) {
        return list.
                stream().
                anyMatch(t -> t.getBatch().equals("Spring"));
    }

    //task 04--> Sort batches from greater to smaller according to the totalStudent
    public static List<MyTech> sortBatchesACTotalStudent(List<MyTech> list) {
        return list.
                stream().
                sorted(Comparator.comparing(MyTech::getTotalStudent).reversed()).
                collect(Collectors.toList()); //collect()-> adds the objects in stream according to desired requirement
        //Collectors.toList()-> converts the objects in collect to List
    }

    //task 05-->Sort batches from smaller to grater according to batchAverage and  print the first 3
    public static List<MyTech> sortACBatchAverage(List<MyTech> list) {
        return list.
                stream().
                sorted(Comparator.comparing(MyTech::getBatchAverage).reversed()).
                // sorted(Comparator.comparingInt(t->t.getBatchOrt())).
                        limit(3).   //limit the first 3 elements
                        collect(Collectors.toList());
        //Collectors.toList()
    }

    //task 06--> create a method to find the least 2nd total student batch
    public static List<MyTech> findThe2LeastTotalStudentBatches(List<MyTech> list) {
        return list.
                stream().
                sorted(Comparator.comparing(MyTech::getTotalStudent)).// sorted according to totalStudent
                        limit(2).   //limited the first 2 batches
                        skip(1).    //skipped the fist batch
                        collect(Collectors.toList());

    }

    //task 07--> create a method that adds the totalStudent number of batches whose batchAverage is greater than 95
    public static int findTotalStudentsFromBatchAverageMoreThan95(List<MyTech> list) {
        return list.
                stream().
                filter(t -> t.getBatchAverage() > 95).
                map(t -> t.getTotalStudent()).
                //reduce(0,Integer::sum);               adds studentTotal
                        reduce(0, (t, u) -> t + u);      //adds studentTotal
    }

    public static int findTotalStudentBatchAverageGreaterThan95(List<MyTech> list) {
        return list.
                stream().
                filter(t -> t.getBatchAverage() > 95).
                mapToInt(t -> t.getTotalStudent()).         //mapToInt()-->As per type returns  int and sum() works
                // No need for reduce as faster coding is possible with mapToInt()
                        sum();

    }

    //task 08--> create a method that finds the average of the BatchAverages that total Student is greater than 130
    public static OptionalDouble findAverageBatchesGreater130(List<MyTech> list) {
        return list.
                stream().
                filter(t -> t.getTotalStudent() > 130).
                mapToDouble(t -> t.getBatchAverage()).
                average();

    }

    //task 09-->Print Daytime batches total numbers
    public static int totalOfDayLightBatches(List<MyTech> list) {
        return (int) list.
                stream()
                .filter(t -> t.getBatchName().contains("Daytime")).count();

    }

    //task 10-->Create a method that finds max Batch average where totalStudent is greater than 130
    public static OptionalInt maxBatchAverageTotalStudentGreaterThan130(List<MyTech> list) {
        return list.
                stream().
                filter(t -> t.getTotalStudent() > 130).
                mapToInt(MyTech::getBatchAverage).
                max();

    }

    //task 11-->Create a method that finds min Batch average where totalStudent is less than 150
    public static int minBatchAverageTotalStudentLessThan150(List<MyTech> list) {
        return list.
                stream().
                filter(t -> t.getTotalStudent() < 150).
                mapToInt(MyTech::getBatchAverage).
                min().
                getAsInt();//getAsInt()-->cıktıyı int type olarak return eder
    }
}

