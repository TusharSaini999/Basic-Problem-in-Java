///WAP to copy one array elements into another array.
package ArrayOperations;
import java.util.Scanner;
class Q125{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int []copy=new int[n];
        for(int i=0;i<n;i++){
            copy[i]=arr[i];
        }
        System.out.print("Copy Array: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}