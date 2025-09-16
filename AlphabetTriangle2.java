/*
 * Write a program to print the following pattern for a given number of rows.
 * Pattern for N = 4 is:
 * A
 * B B
 * C C C
 * D D D D
 */
import java.util.Scanner;

public class AlphabetTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
    }
}