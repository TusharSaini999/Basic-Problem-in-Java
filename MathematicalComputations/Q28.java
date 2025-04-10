///WAP to check enter number is prime or not.
package MathematicalComputations;
import java.util.Scanner;
class Q28{
    public static void main(String[]arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int temp=0;
        for(int i=1;i<=n;i++){
            if(i==0||i==1||i==2||i==n){
                continue;
            }
            else if(n%i==0){
                temp=1;
            }
        }
        if(temp==1 || n==0||n==1){
            System.out.print("This is not Prime No");
        }
        else {
            System.out.print("This is a Prime No");
        }
    }
}