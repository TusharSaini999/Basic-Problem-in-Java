///WAP to delete an element from an array.
/// All Element are not same
import java.util.Arrays;
import java.util.Scanner;

class Q132{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Enter a Deleted Element: ");
        int del=s.nextInt();
        int k=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==del){
                k=i;

            }
        }
        if(k==-1){
            System.out.println("Element Not Found");
        }
        else {
            for(int i=k;i<(n-1);i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=0;
            System.out.print("Array:");
            for (int i: Arrays.copyOf(arr,(n-1))){
                System.out.print(i+" ");
            }
        }

    }
}
