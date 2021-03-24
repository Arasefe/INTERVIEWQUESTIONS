package lambdaPackage.basics;

public class AddTreeValues {
    public static void main(String[] args) {
        TriFunction<Integer,Integer,Integer,Integer>addTree=(x,y,z)->x+y+z;
        System.out.println(addTree.apply(23,37,87));


        NoArgFunction<String>sayHello=()->"Hello";
        System.out.println(sayHello.apply());
    }
}
