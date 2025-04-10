///WAP to arrange the arrays even elements at even place and odd elements at odd place.
package ArrayOperations;
import java.util.Arrays;
import java.util.Scanner;
class Q136{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Element: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        arr=arrangEvenOdd(arr);
        System.out.print("Array:");
        for (int i: arr){
            System.out.print(i+" ");
        }

    }
    private static int[] arrangEvenOdd(int[] arr){
        int even=0;
        int odd=1;
        for (int j : arr) {
            if (j % 2 == 0) {
                even = even + 2;
            } else {
                odd = odd + 2;
            }
        }
        int fin = Math.max(even, odd);
        System.out.println(even+" "+odd);
        even=0;
        odd=1;
        int[] finarr =new int[fin-1];
        Arrays.fill(finarr,-1);
        for (int j : arr) {
            if (j % 2 == 0) {
                finarr[even] = j;
                even=even+2;
            } else {
                finarr[odd] = j;
                odd=odd+2;
            }
        }
        return finarr;
    }
}
