import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = scan.nextLine();
        if (str.length()>str1.length()) {
            System.out.println(str);
        }
        else {
            System.out.println(str1);
        }
    }
}
