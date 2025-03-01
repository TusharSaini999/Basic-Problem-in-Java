///WAP to print the sum of digits of a number
import java.util.Scanner;
class Q24{
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        int tem=String.valueOf(n).length();
        int sum=0;
        for(int i=1;i<=tem;i++){
            sum+=(n%10);
            n=n/10;
        }
        System.out.println("Sum of the : "+sum);
    }
}