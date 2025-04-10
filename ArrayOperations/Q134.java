///WAP to update an element in an array at given index.
package ArrayOperations;
import java.util.Scanner;
class Q134{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Enter a index: ");
        int ind=s.nextInt();
        if((ind<0) || (n<=ind)){
            System.out.println("Index between Array Index");
            return;
        }
        System.out.print("Enter a New Element: ");
        int ele=s.nextInt();
        arr[ind]=ele;
        System.out.print("Array:");
        for (int i: arr){
            System.out.print(i+" ");
        }
    }
}