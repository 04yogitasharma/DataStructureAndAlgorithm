public class decimal_to_binary {
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(n/2);
        System.out.print(n%2+"");
    }
    public static void main(String[] args) {
        fun(5);
        System.out.println();
        fun(4);

    }
}
