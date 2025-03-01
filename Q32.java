///WAP to find the factorial of n numbers.
import java.util.Scanner;
class Q32{
    public static void main(String[]arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int pro=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                pro=pro*j;
            }
            System.out.println("Factorial of "+i+" is "+pro);
            pro=1;
        }

    }
}