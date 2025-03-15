/// A
/// B A
/// C B A
/// D C B A
/// E D C B A

import java.util.Scanner;
class Q90{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Charecter: ");
        char n=s.next().charAt(0);
        for(int i=65;i<=(int)n;i++){
            for(int j=i;j>=65;j--){
                System.out.print((char)j);
                if(j!=65){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}