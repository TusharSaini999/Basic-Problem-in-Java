/// WAP to find the factorial of a number using do-while loop.
package MathematicalComputations;
import java.util.Scanner;
class Q31{
    public static void main(String[]arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int pro=1;
        int i=1;
        do{
            pro=pro*i;
            i++;
        }while (i<=n);
        System.out.println("Factorial :"+pro);
    }
}