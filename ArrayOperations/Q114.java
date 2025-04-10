///WAP to find the highest number in an array.
package ArrayOperations;
import java.util.Scanner;
class Q114{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int max=0;
        for(int i:arr){
            if(i>max){
                max=i;
            }
        }
        System.out.print("Highest number in an array :"+max);
    }
}