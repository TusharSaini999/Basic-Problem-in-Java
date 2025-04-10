///WAP to find the length of array.
package ArrayOperations;
import java.util.Scanner;
class Q122{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int count=0;
        for (int a:arr){
            count++;
        }
        System.out.print("Length of Array: "+count);
    }
}