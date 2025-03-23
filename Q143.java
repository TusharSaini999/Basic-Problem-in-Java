///WAP to find power of a number.
import java.util.Scanner;

class Q143 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = s.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = s.nextInt();
        int pow=1;
        for(int i=1;i<=exponent;i++){
            pow*=base;
        }
        System.out.println("Power of No: "+pow);
        s.close();
    }
}
