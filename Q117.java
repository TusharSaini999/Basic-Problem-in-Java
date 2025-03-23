///WAP to find the number of occurrence of a particular number.

import java.util.Scanner;
class Q117{
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
        System.out.print("Enter a Number: ");
        int elei=s.nextInt();
            for(int j:arr){
                if(elei==j){
                    count++;
                }
            }
        System.out.println(elei+" is come in count "+count);
    }
}