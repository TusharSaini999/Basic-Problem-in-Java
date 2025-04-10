///WAP to find the factorial of largest elements.
package ArrayOperations;
import java.util.Scanner;
class Q137{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Element: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(max<i){
                max=i;
            }
        }
        int fact=1;
        for(int i=max;i>0;i--){
            fact*=i;
        }
        System.out.print("Factorial of largest elements:"+fact);
    }
}

