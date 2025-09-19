/*
 * Write a program to print the following pattern for the given N number of rows.
 * Pattern for N = 4 is:
 *      * * * *
 *      * * * 
 *      * * 
 *      * 
 */
import java.util.Scanner;
public class FlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        for(int i = 1; i <= n; i++){
            for(int j = n; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
