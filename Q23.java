///WAP to print reverse of number
///pro*=i;
import java.util.Scanner;
class Q23{
    public static void main(String[] arg){
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        n=s.nextInt();
        int pro=0;
        int temp=String.valueOf(n).length();
        for(int i=1;i<=temp;i++) {
            pro=((pro*10)+(n%10));
            n=n/10;
        }
        System.out.println("Reveres :"+pro);
    }
}