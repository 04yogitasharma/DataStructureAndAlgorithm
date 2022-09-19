import java.util.Scanner;
public class palindrome {
    public static int fun(int a){
        int rev=0,rem;
        while(a>0){
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        return rev;
    }
    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      int num=s.nextInt();
      int c=fun(num); 
      System.out.println("The reverse is:"+c);
      if(num==c){
          System.out.println("The number is palindrome");
      }
      else{
        System.out.println("The number is not palindrome");
      }
      s.close();
    }
}
