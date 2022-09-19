import java.util.Scanner;
public class isPrime {
    static int isprimeno(int a){
        if(a==1){
            return -1;
        }
        if(a==2||a==3){
            return 1;
        }
        if(a%2==0||a%3==0){
            return -1;
        }
        for(int i=5;(i*i)<=a;i=i+6){
            if(a%i==0||a%(i+2)==0){
                return -1;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int c=isprimeno(num);
        System.out.println(c);// 1 for prime no.     and -1 for non prime no.
        if(c==1){
        System.out.println(num +" is prime number");
        }
        else{
        System.out.println(num +" is not prime number");
        }
        s.close();
    }
}
