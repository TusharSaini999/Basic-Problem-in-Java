///WAP to find the average of five subjects.
package BasicArithmetic;
import java.util.Scanner;

class Q4 {
    public static void main(String[] arg){
        Scanner s= new Scanner(System.in);
        float a,b,c,d,e;
        System.out.print("Enter a Subject : ");
        a=s.nextFloat();
        b=s.nextFloat();
        c=s.nextFloat();
        d=s.nextFloat();
        e=s.nextFloat();
        float avg =((a+b+c+d+e)/5);
        System.out.println("Avg of Subject : "+avg);
    }
}