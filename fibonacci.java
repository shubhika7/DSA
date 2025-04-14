import java.util.Scanner;  // For user input
import java.io.*;   

public class fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int f1 = 0;
        int f2 = 1;
        int cur = 0;
        System.out.print(f1+ " ");
        System.out.print(f2+ " ");
        for(int i=2; i<n; i++){
            cur = f1 + f2;
            f1 = f2;
            f2 = cur;
            System.out.print(cur+" ");
        }
        
    }

}

