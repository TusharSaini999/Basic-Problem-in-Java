/// A
/// BA
/// CBA
/// DCBA
/// EDCBA

import java.util.Scanner;
class Q89{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Charecter: ");
        char n=s.next().charAt(0);
        for(int i=65;i<=(int)n;i++){
            for(int j=i;j>=65;j--){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}