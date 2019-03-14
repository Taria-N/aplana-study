import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]*2);
        }
    }
}
