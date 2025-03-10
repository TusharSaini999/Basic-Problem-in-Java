/// A A A A A
/// B B B B B
/// C C C C C
/// D D D D D
/// E E E E E
import java.util.Scanner;
class Q51{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        char c=65;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(c);
                if(j!=n-1){
                    System.out.print(" ");
                }
            }
            c++;
            System.out.println();
        }
    }
}