public class sum_of_digit {
    static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return sum(n/10)+n%10;
        }
    }
    public static void main(String[] args) {
        int a=555555555;
        int c=sum(a);
        System.out.println(c);
    }
}
