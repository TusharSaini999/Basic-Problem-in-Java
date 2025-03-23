///WAP to find a particular element is available in an array.

import java.util.Scanner;
class Q119{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int[] arr =new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print("Enter a Number: ");
        int elei=s.nextInt();
        int flag=0;
        for(int j:arr){
            if(elei==j){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Number not Available");
        }
        else {
            System.out.println("Number Available");
        }
    }
}