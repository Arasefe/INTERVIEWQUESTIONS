package hackerRank;

public class _10Example {
    protected int a=10;
    public int b=9;

    protected _10Example(int a, int b){
        this.a=a;
        this.b=b;
    }
    protected void add(){
        System.out.println(a+b);
    }
}
class Examp extends _10Example{
    public Examp(int a, int b){
        super(a,b);
    }

    public static void main(String[] args) {
        Examp e=new Examp(15,10);
        e.add();
    }
}