import java.util.Scanner; // For user input
import java.io.*;
public class rotateNum {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();
    int temp = n;
    int nod = 0;
    while(temp>0){
        temp /= 10;
        nod++;
    }
    int div = 1;
    int mult = 1;
    for(int i=1; i<=nod; i++){
        if(i<=k){
            div *= 10;
        }else{
            mult *=10;
        }
    }
    int q = n/div;
    int r = n%div;
    r= r*mult + q;
    System.out.println(r);
}
}
