///      *
///     * *
///    * * *
///   * * * *
import java.util.Scanner;

class Q83{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        int cou=1;
        for(int i=n;i>0;i--){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=cou;j++){
                System.out.print("*");
                if(j==cou){
                    System.out.println();
                }
                else {
                    System.out.print(" ");
                }
            }
            cou++;
        }
    }
}
