package hackerRank;

public class _3Addition {
    int a;int b=9;
    public int sum(){
        return a+b;
    }
    private int add(){
        return a+b;
    }
    int result(){
        return new _3Addition().add();
    }
}
class Test {
    public static void main(String[] args) {
        _3Addition e=new _3Addition();
        System.out.println(e.sum()+e.result());
    }
}
