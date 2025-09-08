/*
4
a a a a 
B B B B 
c c c c 
D D D D 
 */
import java.util.Scanner;

public class AlphabetSquare4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= n; j++) {
                    System.out.print((char) (i + 96) + " ");
                }
            } else {
                for (int j = 1; j <= n; j++) {
                    System.out.print((char) (i + 64) + " ");
                }
            }

            System.out.println();
        }
    }
}
