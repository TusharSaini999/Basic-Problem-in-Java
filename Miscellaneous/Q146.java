///WAP to print the Fibonacci series.
package Miscellaneous;
import java.util.Scanner;
class Q146{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        if(n<3){
            System.out.println("No is less then 3");
            return;
        }
        else {
            System.out.print("0 1");
            int a=0;
            int b=1;
            for (int i = 2; i <n; i++) {
                System.out.print(" ");
                int temp=b;
                b=b+a;
                a=temp;
                System.out.print(b);
            }
        }
    }
}