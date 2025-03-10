/// * * * * *
/// * * * *
/// * * *
/// * *
/// *
import java.util.Scanner;

class Q44{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=s.nextInt();
        for(int i=n;i>=0;i--){
            for(int j=i;j>=0;j--){
                    if(i==j){
                        System.out.println("");
                    }
                    else {
                        System.out.print("*");
                    }
                    if(j>0){
                        System.out.print(" ");
                    }
            }
        }
    }
}