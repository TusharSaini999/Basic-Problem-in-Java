///WAP to find the GCD of a number.
import java.util.Scanner;
class Q138{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Two Number:");
        int a,b;
        a=s.nextInt();
        b=s.nextInt();
        int maxgcd=0;
        for(int i=1;i<=Math.min(a,b);i++){
            if(a%i==0 && b%i==0){
                maxgcd=i;
            }
        }
        System.out.println("GCD is :"+maxgcd);
    }
}
