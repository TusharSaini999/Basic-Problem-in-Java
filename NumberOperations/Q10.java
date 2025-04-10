///WAP to check entered number is even or odd.
///n%2==0
package NumberOperations;
import java.util.Scanner;
class Q10{
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n=s.nextInt();
        if(n%2==0){
            System.out.println("It is Even");
        }
        else{
            System.out.println("It is odd");
        }
    }
}