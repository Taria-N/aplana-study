import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String s = scan.nextLine();
        int i = 1;
        int x = 0;
        for (int n = s.length(); n > 0; n--) {
            if (s.charAt(n - 1) == '1' ) {
                x = x+i;
            }
            i = i*2;
        }
        System.out.println(x);
    }
}
