///WAP to find the three largest integers in an array.
import java.util.Scanner;
class Q131{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int max=0;
        int secmax=0;
        int therdmax=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                therdmax=secmax;
                secmax=max;
                max=arr[i];
            }
            else if(secmax<arr[i] && max>arr[i]){
                therdmax=secmax;
                secmax=arr[i];
            }
            else if(therdmax<arr[i] && secmax>arr[i]){
                therdmax=arr[i];
            }
        }

        System.out.println("Max : "+max);
        System.out.println("Second Max : "+secmax);
        System.out.println("Thred Max : "+therdmax);
    }
}