/*
 * Write a program to print the following pattern for the given N number of rows.
 * Pattern for N = 4 is:
 *      1 2 3 4
 *      1 2 3
 *      1 2
 *      1
 */
import java.util.Scanner;
public class NumberTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}