///WAP to swap two numbers using third variable.
package BasicArithmetic;
import java.util.Scanner;
public class Q6{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.print("Enter a: ");
        a=s.nextInt();
        System.out.print("Enter b: ");
        b=s.nextInt();
        System.out.println("Before Swap");
        System.out.println("A is "+a+" And B is "+b);
        //logic of swap using temp
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap");
        System.out.println("A is "+a+" And B is "+b);
    }
}