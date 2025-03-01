///WAP to find the nCr.
/// Not handal 55 is overflow the range of long
import java.util.Scanner;
class Q30{
    public static void main(String[]arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a N: ");
        long n=s.nextLong();
        System.out.print("Enter a R: ");
        long r=s.nextLong();
        long pre=(fac(n)/(fac((n-r))*fac(r)));
        System.out.print("Comibation is : "+pre);

    }
    static long fac(long n){
        long sum=1;
        for(long i=1;i<=n;i++){
            sum*=i;
        }
        return sum;
    }
}