///WAP to print the table of given number.
package MathematicalComputations;
import java.util.Scanner;
class Q33{
    public static void main(String[]arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }

    }
}