///WAP to Convert 0F into 0C.
///c=(((f-32)*51)/9)
import java.util.Scanner;
public class Q8{
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        float f;
        System.out.print("Enter a Temp in F: ");
        f=s.nextFloat();
        float c=(((f-32)*5)/9);
        System.out.println("Temp in C: "+c);
    }
}