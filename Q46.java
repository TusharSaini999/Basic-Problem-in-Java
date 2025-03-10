///         *
///       * *
///     * * *
///   * * * *
/// * * * * *
import java.util.Scanner;

class Q46{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=5;j>0;j--){
                if(i>=j){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                if(j!=1){
                    System.out.print(" ");
                }

            }
            System.out.print("\n");
        }
    }
}