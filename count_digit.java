import java.util.Scanner;
class count_digit{
    public static int fun(int a){
        int count=0;
        while(a!=0){
            a=a/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
    int c=fun(num);
    System.out.println("The no. of digit is:"+c);
    sc.close();
    }
}