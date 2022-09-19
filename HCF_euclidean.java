import java.util.Scanner;
public class HCF_euclidean {
    static int hcf(int x,int y){
        while(x!=y){
            if(x>y){
                x=x-y;
            }
            else{
                y=y-x;
            }
        }
        return x;
    }
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.print("The First number is:");
       int num1=s.nextInt();
       System.out.print("The Second number is:");
       int num2=s.nextInt(); 
       int a=hcf(num1,num2);
       System.out.println("The HCF of "+num1+" and "+num2+" is:"+a);
       s.close();
    }
}
