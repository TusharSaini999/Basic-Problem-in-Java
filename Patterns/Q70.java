/// A
/// BB
/// CCC
/// DDDD
/// EEEEE
package Patterns;
import java.util.Scanner;
class Q70{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Charecter:");
        char n=s.next().charAt(0);
        for(int i=65;i<=(int)n;i++){
            for(int j=65;j<=i;j++){
                System.out.print((char)i);
            }
            System.out.println();
        }
    }
}