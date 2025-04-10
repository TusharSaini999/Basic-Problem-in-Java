///WAP to find the LCM of 3 numbers.
package Miscellaneous;
import java.util.Scanner;

class Q139 {
    static int findGCD(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    static int findLCM(int x, int y) {
        return (x * y) / findGCD(x, y);
    }

    static int findLCMThree(int a, int b, int c) {
        int lcmAB = findLCM(a, b);
        return findLCM(lcmAB, c);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter three numbers: ");

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int lcm = findLCMThree(a, b, c);
        System.out.println("LCM is: " + lcm);

        s.close();
    }
}
