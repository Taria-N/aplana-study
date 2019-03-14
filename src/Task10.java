import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int[][] table = new int[2][3];
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                table [i][j] = scan.nextInt();

            }
        }

            for (int j = 0; j < 3; ++j) {
                System.out.print(table [0][j]*3 + " ");
            }

    }
}
