import java.util.Scanner;  // For user input
import java.io.*;   
public class Loops {
    public static void main(String[] args) {
        /*
        // while loop
        int i = 1;
        while(i<=9){
            System.out.println(i);
            i += 1;
            }
            System.out.println("Done.");
        // for loop
       for(int j=0; j<=9; j++){
        System.out.println(j);
       } 
         */

        // Taking input
        Scanner scn = new Scanner(System.in);
        /*
         int n = scn.nextInt(); // Use this for only integer input
         String name = scn.nextLine(); // Use this for only string input
         */
        // Use parseInt(scn.nextLine) for inputting both in one program
        int n = Integer.parseInt(scn.nextLine());
        String name = scn.nextLine();
        System.out.println("Hello " + name + " Here begins the counting.");  
        for(int i=0; i<=n; i++){
            System.out.println(i);
        }
    } 
    
}
