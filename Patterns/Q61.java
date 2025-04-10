/// AAAAA
/// BBBB
/// CCC
/// DD
/// E
package Patterns;
import java.util.Scanner;

class Q61{
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Enter a Charecter: ");
        char n=s.next().charAt(0);
        for(int i=65;i<=(int)n;i++){
            for(int j=(int)n;j>=i;j--){
                System.out.print((char)i);
            }
            System.out.println();
        }
    }
}