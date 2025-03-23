///WAP to find the sum of cubes of every digits of a given number.
/// 143 =>1+64+27=92
import java.util.Scanner;
class Q144{
    private static int sumofcube(int a){
        int sum=0;
        while (a>0){
            int digit=a%10;
            sum=(sum)+(digit*digit*digit);
            a=a/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        System.out.println("Sum of Cube of Every Digit: "+sumofcube(n));
    }
}
