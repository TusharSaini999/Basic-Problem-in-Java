///WAP to check entered number is divisible by 7 or not.
///n%7==0
import java.util.Scanner;
class Q11{
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("Enter a No: ");
        n=s.nextInt();
        if(n%7==0){
            System.out.println("No is Divisbal By 7");
        } else {
            System.out.println("No is Not Divibal by 7");
        }
    }
}