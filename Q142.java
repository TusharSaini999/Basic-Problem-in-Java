///WAP to check enter number is Armstrong or not.
import java.util.Scanner;
class Q142{
    private static int armstrong(int a){
        int arm=0;
        while (a>0){
            int digit=a%10;
            arm=(arm)+(digit*digit*digit);
            a=a/10;
        }
        return arm;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        if(n==armstrong(n)){
            System.out.println("It is Armstrong No");
        }
        else {
            System.out.println("It is not Armstrong No");
        }
    }
}