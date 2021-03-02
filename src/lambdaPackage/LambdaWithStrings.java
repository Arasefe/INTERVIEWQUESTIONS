package lambdaPackage;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LambdaWithStrings {
    public LambdaWithStrings() {
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Ali");
        list.add("Mark");
        list.add("Jackson");
        list.add("Amanda");
        list.add("Mariano");
        list.add("Alberto");
        list.add("Tucker");
        list.add("Christ");
        System.out.println(checkLastChar(list));
    }

    public static List<String> getEl1(List<String> list) {
        list.removeIf((t) -> {
            return t.length() > 5;
        });
        return list;
    }

    public static List<String> getEl2(List<String> list) {
        list.removeIf((t) -> {
            return t.startsWith("A") || t.endsWith("n");
        });
        return list;
    }

    public static void sortLengthEl(List<String> list) {
        Stream var10000 = list.stream().map((t) -> {
            return t.toUpperCase();
        }).sorted(Comparator.comparing((t) -> {
            return t.length();
        }));
        PrintStream var10001 = System.out;
        var10000.forEach(var10001::println);
    }

    public static void sortLastChar(List<String> list) {
        Stream var10000 = list.stream().map((t) -> {
            return t.toLowerCase();
        }).sorted(Comparator.comparing((t) -> {
            return t.substring(t.length() - 1);
        }));
        PrintStream var10001 = System.out;
        var10000.forEach(var10001::println);
    }

    public static void getCharAndLength(List<String> list) {
        Stream var10000 = list.stream().sorted(Comparator.comparing((t) -> {
            return t.length();
        })).map((t) -> {
            return t + ": " + t.length();
        });
        PrintStream var10001 = System.out;
        var10000.forEach(var10001::println);
    }

    public static boolean checkLength(List<String> list) {
        return list.stream().allMatch((t) -> {
            return t.length() < 8;
        });
    }

    public static boolean checkInitials(List<String> list) {
        return list.stream().noneMatch((t) -> {
            return t.startsWith("X");
        });
    }

    public static boolean checkLastChar(List<String> list) {
        return list.stream().anyMatch((t) -> {
            return t.endsWith("r");
        });
    }
}
