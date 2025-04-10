///WAP to print the table from m to m.
package MathematicalComputations;
import java.util.Scanner;
class Q34{
    public static void main(String[]arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a N: ");
        int n=s.nextInt();
        System.out.print("Enter a M: ");
        int m=s.nextInt();

        for(int i=n;i<=m;i++){
            for(int j=1;j<=10;j++){
                System.out.println(i+" * "+j+" = "+i*j);
            }
            System.out.print("\n\n");
        }
    }
}