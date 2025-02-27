/// WAP to print the first n numbers.
import java.util.Scanner;
class Q15{
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        int a;
        System.out.print("Enter a N: ");
        a=s.nextInt();
        for(int i=0;i<=a;i++){
            System.out.println(i);
        }
    }
}