///WAP to find the factorial of a number
///pro*=i;
package MathematicalComputations;
import java.util.Scanner;
class Q22{
    public static void main(String[] arg){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        n=s.nextInt();
        int pro=1;
        for(int i=1;i<=n;i++) {
            pro*=i;
        }
        System.out.println("Factorial :"+pro);
    }
}