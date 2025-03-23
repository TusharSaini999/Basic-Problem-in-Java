///WAP to find the sum of odd numbers in an array.
import java.util.Scanner;
class Q112{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int oddSum=0;
        for(int i:arr){
            if(i%2!=0){
                oddSum+=i;
            }
        }
        System.out.println("Odd Sum "+oddSum);
    }
}