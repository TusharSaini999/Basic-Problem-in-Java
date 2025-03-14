///*
///*
///*
///*
///* * * * *
import java.util.Scanner;
class Q35{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter a No: ");
        int n=a.nextInt();
        for (int i=0;i<n;i++){
            if(i==n-1){
                for (int j=0;j<n;j++){
                    System.out.print("*");
                    if(j!=n-1){
                        System.out.print(" ");
                    }
                }
            }
            else {
                System.out.println("*");
            }
        }

    }
}
