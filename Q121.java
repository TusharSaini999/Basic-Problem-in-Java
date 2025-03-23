///WAP to find the duplicate elements in an array.
///Using a brute force
import java.util.Arrays;
import java.util.Scanner;
class Q121{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Size of Array: ");
        int n=s.nextInt();
        int []arr=new int[n];
        System.out.print("Enter a Element :");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        //Sort the Array
        Arrays.sort(arr);
        //Find the Same Element
        for(int i=0;i<(n-1);i++){
            if(arr[i]==arr[i+1]){
                System.out.println("Dupicate Element: "+arr[i]);
            }
        }
    }
}