public class sum_of_no {
    static int fun(int n){
        if(n==0){
            return 0;
        }
        return n+fun(n-1);
        // System.out.println(n);
        
    }
    public static void main(String[] args) {
        int a=3;
        int c=fun(a);
        System.out.println(c);
    }
}
