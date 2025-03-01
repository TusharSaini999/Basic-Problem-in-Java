///WAP to convert decimal number into binary number
import java.util.Scanner;
class Q27{
    public static void main(String[]arg){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        String biner="";
        while (true){
            if(n==0||n==1){
                biner=(biner+String.valueOf(n));
                break;
            }
            else{
                biner=(biner+String.valueOf((n%2)));
                n=n/2;
            }
        }
        //binery var is reveres
        String revers="";
        for(int i=(biner.length()-1);i>=0;i--){
            revers=revers+biner.charAt(i);
        }
        System.out.println("Biner :"+revers);

    }
}