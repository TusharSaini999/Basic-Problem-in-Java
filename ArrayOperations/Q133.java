///WAP to insert an element in an array at given index .
package ArrayOperations;
import java.util.Scanner;
class Q133{
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
        if((ind<0) || (n<ind)){
            System.out.println("Index between Array Index");
            return;
        }
        System.out.print("Enter a Element: ");
        int ele=s.nextInt();
        int[] newarr =insert(arr,ele,ind);
        System.out.print("Array: ");
        for(int i:newarr){
            System.out.print(i+" ");
        }
    }
    private static int[] insert(int[] arr, int ele, int ind){
        int[] newarr =new int[(arr.length+1)];
        int ari=0;
        for(int i=0;i<(newarr.length);i++){
            if(i==ind){
                newarr[i]=ele;
            }
            else {
                newarr[i]=arr[ari++];
            }
        }
        return newarr;
    }
}