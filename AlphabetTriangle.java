/*
 * Write a program to print the following pattern for a given number of rows.
 * Pattern for N = 4 is:
 * A
 * A B
 * A B C
 * A B C D
 */
import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
    }
}