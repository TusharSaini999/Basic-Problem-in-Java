///WAP to check enter number is palindrome or not.
package Miscellaneous;
import java.util.Scanner;
class Q141{
    private static int revers(int a){
        int revse=0;
        while (a>0){
            revse=(revse*10)+(a%10);
            a=a/10;
        }
        return revse;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        if(n==revers(n)){
            System.out.println("It is Palindrome No");
        }
        else {
            System.out.println("It is not Palindrome No");
        }
    }
}