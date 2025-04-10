////WAP to find area of triangle.
package BasicArithmetic;
import java.util.Scanner;

class Q3{
    public static void main(String[] arg){
        Scanner s= new Scanner(System.in);
        float b,h;
        System.out.print("Enter a Height :");
        h=s.nextFloat();
        System.out.print("Enter a Base :");
        b=s.nextFloat();

        float area=((1f/2f)*b*h);
        System.out.println("Area is : "+area);
    }
}