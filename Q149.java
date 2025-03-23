///WAP to print the array in reverse order.
import java.util.Arrays;
import java.util.Scanner;
class Q149{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Array in Reverse Order:");
        for (int i=(n-1);i>=0;i--){
            System.out.print(" ");
            System.out.print(arr[i]);
        }
    }
}
