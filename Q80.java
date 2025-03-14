/// 1
/// 2 2 2
/// 3 3 3 3 3
/// 4 4 4 4 4 4 4
/// 5 5 5 5 5 5 5 5 5


import java.util.Scanner;
class Q80{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a No:");
        int n=s.nextInt();
        for(int i=1;i<=n*2;i++){
            if(i%2!=0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print((i/2)+1);
                    if(i!=j){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}