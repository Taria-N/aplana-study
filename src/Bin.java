import java.util.Scanner;

public class Bin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bin = scanner.nextLine();

        int dec = Integer.parseInt(bin, 2);

        System.out.println(dec);
    }
}
