public class merge {
    public static int findMedian(int a[], int m, int b[], int n)
    {
        int i=0,j=0,k=0;
        int arr[]=new int[m+n];
        while(i<m&&j<n){
            if(a[i]<b[j]){
                arr[k]=a[i];
                i++;
                k++;
            }
            else if(a[i]>b[j]){
                arr[k]=b[j];
                j++;
                k++;
            }
            else if(a[i]==b[j]){
                arr[k]=a[i];
                k++;
                arr[k]=b[j];
                j++;
                i++;
                
                k++;
            }
        }
        while(i<m){
             arr[k]=a[i];
             i++;
             k++;
                
        }
        while(j<n){
            arr[k]=b[j];
            j++;
            k++;
        }
        
        int x=m+n;
        for(int p=0;p<x;p++)
        System.out.print(arr[p]+" ");
        
        
        int median;
        
        if((m+n)%2==0){
            median=((arr[x/2]+arr[(x/2)-1])/2);
        }
        else{
            median=arr[x/2];
        }
        return median;
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        int b[]={1,3,4,5,7,9};
        int m=a.length;
        int n=b.length;
        System.out.println(findMedian(a, m, b, n));
    }
}
