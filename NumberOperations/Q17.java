///WAP to print the first n even numbers
///0 to n where i%2==0
package NumberOperations;
import java.util.Scanner;
class Q17{
    public static void main(String[] arg){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        n=s.nextInt();
        for(int i=0;i<=n;i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}