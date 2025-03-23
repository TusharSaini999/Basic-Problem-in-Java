///WAP to find a particular element is available in an array.

import java.util.Scanner;
class Q118{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int count=0;
        for(int i:arr) {
            for (int j : arr) {
                if (i == j) {
                    count++;
                }
            }
            System.out.println(i+" is come in count "+count);
            count=0;
        }

    }
}