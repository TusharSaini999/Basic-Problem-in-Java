/// WAP to enter a number and corresponding English Word.
/// Eg: 2  TWO
/// 5  FIVE
package NumberOperations;
import java.util.Scanner;
class Q13{
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.print("Enter a No");
        n=s.nextInt();
        if((n<0) || (n>9)){
            System.out.println("Enter no in 0 to 9");
        }
        if(n==1){
            System.out.println("ONE");
        } else if (n==2) {
            System.out.println("TWO");
        }
        else if (n==3) {
            System.out.println("THREE");
        }
        else if (n==4) {
            System.out.println("FOUR");
        }
        else if (n==5) {
            System.out.println("FIVE");
        }
        else if (n==6) {
            System.out.println("SIX");
        }
        else if (n==7) {
            System.out.println("SEVEN");
        }
        else if (n==8) {
            System.out.println("EIGHT");
        }
        else if (n==9) {
            System.out.println("NINE");
        }
        else if (n==0) {
            System.out.println("ZERO");
        }
    }
}