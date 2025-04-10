///WAP to copy only even numbers from one array to another array.
package ArrayOperations;
import java.util.Arrays;
import java.util.Scanner;
class Q126{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int[] evenarr =evenArray(arr);
        System.out.print("Even Array: ");
        for(int i:evenarr){
            System.out.print(i+" ");
        }
    }
    private static int[] evenArray(int []arr){
        int[] newarr =new int[(arr.length)];
        int j=0;
        for (int k : arr) {
            if (k % 2 == 0) {
                newarr[j++] = k;
            }
        }
        return Arrays.copyOf(newarr,j);
    }
}