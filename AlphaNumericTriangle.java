/*
 * Write a program to print the following pattern for a given number of rows.
 * Pattern for N = 4 is:
 * 1
 * A B
 * 1 2 3
 * A B C D
 * 1 2 3 4 5
 * A B C D E F
 */
import java.util.Scanner;
public class AlphaNumericTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                for(int j = 1; j <= i; j++){
                    System.out.print(j+" ");
                }
            } else {
                for(int j = 1; j <= i; j++){
                    System.out.print((char)(j+64)+" ");
                }
            }
            System.out.println();
        }
    }
}