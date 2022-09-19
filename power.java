import java.util.Scanner;
public class power {
    static int POWER(int n,int p){
        int res=1;
      for(int i=0;i<p;i++){
          res=res*n;
      }
      return res;
    }
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the number: "); 
       int num=s.nextInt();
       System.out.print("Enter the power:");
       int pow=s.nextInt();
      int c= POWER(num,pow);
      System.out.println(c);
       s.close();
    }
}
