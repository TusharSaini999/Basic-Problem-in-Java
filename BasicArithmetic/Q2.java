///WAP to find area of circle.
package BasicArithmetic;
import java.util.Scanner;

class Q2{
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Radius: ");
        float r=s.nextFloat();
        float area=(3.14F*(r*r));
        System.out.println("Area of Circal: "+area);
    }
}