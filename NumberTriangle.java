/*
 * Write a program to print the following pattern for the given N number of rows.
 * Pattern for N = 4 is:
 * 1    
 * 1 2
 * 1 2 3
 * 1 2 3 4
 */
import java.util.Scanner;

public class NumberTriangle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}