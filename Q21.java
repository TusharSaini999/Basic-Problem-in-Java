///WAP to find the sum of divisible by 3, n numbers
///sum+=i
import java.util.Scanner;
class Q21{
    public static void main(String[] arg){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        n=s.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++) {
            if(i%3==0){
                sum+=i;
            }
        }
        System.out.println("Sum of Nth Divided By 3 No :"+sum);
    }
}