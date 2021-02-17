package hackerRank;

public class _3 {
    int a;int b=9;
    public int sum(){
        return a+b;
    }
    private int add(){
        return a+b;
    }
    int result(){
        return new _3().add();
    }
}
class Exampler{
    public static void main(String[] args) {
        _3 e=new _3();
        System.out.println(e.sum()+e.result());
    }
}
