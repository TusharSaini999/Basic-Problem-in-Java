/// *      *
/// *   *
/// *
/// *   *
/// *      *
package Patterns;
import java.util.Scanner;

class Q42 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an Odd Number: ");
        int n = s.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        int j = n - 1;

        for (int i = 0; i < n; i++) {
            System.out.print("*");

            for (int k = 0; k < Math.abs(j); k++) {
                if (k == Math.abs(j) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            j -= 2;
            System.out.println();
        }

        s.close();
    }
}
