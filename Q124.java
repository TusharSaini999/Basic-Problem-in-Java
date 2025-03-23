///WAP to find the average of arrays elements.
import java.util.Scanner;
class Q124{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        float sum=0;
        for (int a:arr){
            sum+=a;
        }
        System.out.print("Avg of Array: "+sum/n);
    }
}