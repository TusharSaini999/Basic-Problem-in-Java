/// WAP to check given two points are in a line or not.
///  (x-x1)/(x2-x1) = (y-y1)/(y2-y1)
package BasicArithmetic;
import java.util.Scanner;
public class Q5{
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        float x1,x2,y1,y2,x,y;
        System.out.print("Enter a (x1,y1) of line: ");
        x1=s.nextFloat();
        y1=s.nextFloat();
        System.out.print("Enter a (x2,y2) of line: ");
        x2=s.nextFloat();
        y2=s.nextFloat();
        System.out.print("Enter a (x,y) Point: ");
        x=s.nextFloat();
        y=s.nextFloat();

        if((x-x1)/(x2-x1) == (y-y1)/(y2-y1)){
            System.out.println("Given point In line");
        }
        else{
            System.out.println("Given point is not in line");
        }
    }
}