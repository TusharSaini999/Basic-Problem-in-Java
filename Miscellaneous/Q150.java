///WAP to count the digits in a given number.
package Miscellaneous;
import java.util.Scanner;
class Q150{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        int c=0;
        while (n>0){
            n=n/10;
            c++;
        }
        System.out.println("Digit in Number: "+c);
    }
}