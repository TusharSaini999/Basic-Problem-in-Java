///WAP to remove duplicate elements in an array.
import java.util.Arrays;
import java.util.Scanner;
class Q123{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int []temparr=new int[n];
        Arrays.sort(arr);
        int j=0;
        for(int i=0;i<(n-1);i++){
            if(arr[i]!=arr[i+1]){
                temparr[j++]=arr[i];
            }
        }
        temparr[j++]=arr[n-1];
        System.out.print("New Element :");
        for(int i=0;i<j;i++){
            System.out.print(temparr[i]+" ");
        }
    }
}