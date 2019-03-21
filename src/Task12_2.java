import java.util.Scanner;

public class Task12_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.print("Возвращаемое значение: ");
        System.out.println(str.replaceAll("(.*)test(.*)",
                "myTest"));


    }

}
