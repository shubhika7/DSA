import java.util.Scanner; // For user input
import java.io.*;

public class PrintReverse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            System.out.println(digit);
        }
    }
}
