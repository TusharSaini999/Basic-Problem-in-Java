///WAP to sort an array in decreasing order.
package ArrayOperations;
import java.util.Scanner;

class Q129{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        //Perfomation a Sorting
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print("Sorted Array in Dncreasing order:");
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}