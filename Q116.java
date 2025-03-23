///WAP to find the second highest number in an array.
import java.util.Scanner;
class Q116{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int secmax=0;
        int max=0;
        for(int i:arr){
            if(i>max){
                secmax=max;
                max=i;
            }
            else if(i<max && i>secmax){
                secmax=i;
            }
        }
        System.out.println("Second Higiht: "+secmax);
    }
}