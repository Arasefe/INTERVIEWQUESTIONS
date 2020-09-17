package Arrays;

public class ArrayDuplicate {
    public static void main(String[] args) {
        int c=getDup(new String[] {"1","2","2","4","1"});
        System.out.println(c);

    }
    public static int getDup(String[] r) {
        int count=0;
        for(int i=0;i<=r.length-2;i++) {
            for(int j=1;j<=r.length-1;j++) {
                if(r[i]==r[j]) {
                    count++;
                }
            }
        }
        return count;
    }

}
