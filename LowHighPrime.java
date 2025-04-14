import java.util.Scanner;  // For user input
import java.io.*;   

public class LowHighPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();
        for(int n = low; n<=high; n++){
            int count = 0;
            // try to divide n and inc count
            for(int i=2; i*i<=n; i++){
                if(n % i==0){
                    count++;
                    break;
                }
            }
            // try to divide n and inc count
            if(count ==0){
                System.out.println(n);
            }
            
        }
        
    }

}

