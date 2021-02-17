package hackerRank;

public class _9 {
    public static void main(String[] args) {
        _9 obj=new _9();
        obj.start();
    }
    private void start(){
        System.out.println(check("12345"));
        System.out.println(check("123456"));
        System.out.println(check(null));
    }
    private boolean check(String astr){
        try{
            return astr.length()>5;
        }catch (NullPointerException e){
            System.out.println("Exception... ");
            return false;
        }
    }
}
