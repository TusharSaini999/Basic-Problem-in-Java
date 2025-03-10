/// 1 2 3 4 5
/// 1 2 3 4 5
/// 1 2 3 4 5
import java.util.Scanner;
class Q37{
    public static void main(String[]arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a N: ");
        int n=s.nextInt();

        for(int i=1;i<(n-1);i++){
            for(int j=1;j<=n;j++){
                System.out.print(j);
                if(j!=n){
                    System.out.print(" ");
                }
            }
            System.out.print("\n");

        }
    }
}