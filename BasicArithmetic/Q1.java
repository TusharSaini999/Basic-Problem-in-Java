///WAP to find the addition of two numbers.
package BasicArithmetic;
import java.util.Scanner;

class Q1 {
    public static void main(String[] arg) {
        Scanner s=new Scanner(System.in);
        float a,b;
        System.out.print("Enter a 1 Number: ");
        a=s.nextFloat();
        System.out.print("Enter a 2 Number: ");
        b=s.nextFloat();
        float sum=a+b;
        System.out.println("Sum of "+a+" and "+b+" is : "+sum);
    }
}