/*
Write a Java program to print a right-angled triangle of stars based on user input for the number of rows.
For example, if the user inputs 5, the output should be:
* 
* * 
* * * 
* * * *
* * * * *
 */
import java.util.Scanner;

public class StarTriangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: "); 
        int rows = scanner.nextInt();
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}