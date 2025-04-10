/// A B C D E
/// A B C D
/// A B C
/// A B
/// A
package Patterns;
import java.util.Scanner;

class Q62 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a Charecter: ");
        char n = s.next().charAt(0);
        for (int i = 65; i <= (int) n; i++) {
            for (int j = (int) n; j >= i; j--) {
                System.out.print((char) i);
                if(j!=i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}