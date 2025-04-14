import java.util.Scanner; // For user input
import java.io.*;

public class Basics {

    // Main method - program entry point
    public static void main(String[] args) {
        // ---Basics---
        /*
         * // "\n"and print statement
         * System.out.print("*\n**\n***\n****\n");
         * System.out.println( );
         * System.out.println("*****\n   *\n  *\n *\n*****");
         * 
         * // Data Type
         * int x = 10;
         * int y= 15;
         * int sum = x+y;
         * int pro = x*y;
         * System.out.println("sum of "+ x +" and "+ y + " is :" + sum);
         * System.out.println("product of "+ x +" and "+ y + " is :" + pro);
         * 
         * // if
         * int n1 = 20;
         * int n2 = 20;
         * if(n1== n2){
         * System.out.println("equal hai");
         * }else if(n1>n2){
         * System.out.println("n1 is greater");
         * 
         * }else{
         * System.out.println("n1 is small");
         */
        // ----Grading System-----

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your marks :");
        int marks = scn.nextInt();
        if (marks > 90) {
            System.out.println("Excellent!");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("Good");
        } else if (marks > 70 && marks <= 80) {
            System.out.println("Fair");
        } else if (marks > 60 && marks <= 70) {
            System.out.println("Meets Expectations");
        } else if (marks <= 60) {
            System.out.println("Below par");
        }
    }

}