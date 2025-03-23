///WAP to find the three smallest integers in an array.
import java.util.Scanner;
class Q135{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int secmin=Integer.MAX_VALUE;
        int therdmin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                therdmin=secmin;
                secmin=min;
                min=arr[i];
            }
            else if(secmin>arr[i] && min<arr[i]){
                therdmin=secmin;
                secmin=arr[i];
            }
            else if(therdmin>arr[i] && secmin<arr[i]){
                therdmin=arr[i];
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Second Min: "+secmin);
        System.out.println("Thred Min: "+therdmin);
    }
}