///WAP to find the sum of n even numbers
///sum+=i
package NumberOperations;
import java.util.Scanner;
class Q20{
    public static void main(String[] arg){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        n=s.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of Nth Even No :"+sum);
    }
}