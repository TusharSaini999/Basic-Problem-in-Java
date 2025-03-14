/// EDCBA
/// EDCB
/// EDC
/// ED
/// E
import java.util.Scanner;
class Q66{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Charecter: ");
        char c=s.next().charAt(0);
        for (int i=65;i<=(int)c;i++){
            for(int j=(int)c;j>=i;j--){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}