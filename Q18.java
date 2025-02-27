///WAP to find the sum of n numbers
///sum+=i
import java.util.Scanner;
class Q18{
    public static void main(String[] arg){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        n=s.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++) {
            sum+=i;
        }
        System.out.println("Sum of Nth No :"+sum);
    }
}