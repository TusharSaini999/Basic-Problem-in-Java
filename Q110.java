///WAP to find the factorial of every element .

import java.util.Scanner;
class Q110{
    public static void main(String []arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Length of Array:");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter a Element:");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int fact=1;
        for(int i:arr){
            for(int j=1;j<=i;j++){
                fact*=j;
            }
            System.out.println("Factorial of "+i+" is :"+fact);
            fact=1;
        }

    }
}