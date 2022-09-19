import java.util.Scanner;
public class factorial {
    public static int fac(int a){
        if(a==0||a==1){
            return 1;
        }
        else{
            return a*fac(a-1);
        }
    }
        public static int trailing_zero(int b){
            int res=0;
            while(b%10==0){
                res++;
                b=b/10;
            }
            return res;
        }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int fact=fac(num);
        System.out.println("The factorial of number is:"+fact);
        int number=trailing_zero(fact);
        System.out.println("The trailing zeros are:"+number);
        s.close();
    }
}
