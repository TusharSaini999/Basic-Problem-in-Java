///WAP to find the sum of array elements.
package ArrayOperations;
import java.util.Scanner;
class Q109{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Length of Array:");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        System.out.println("Sum of Array :"+sum);
    }
}