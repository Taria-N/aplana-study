import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите курс доллара:");
        double d = scan.nextDouble();
        System.out.println("Введите сумму в рублях:");
        double n = scan.nextDouble();
        double result = (n/d);
        result = (double)Math.round(result*100d)/100d;
        System.out.println(result);
    }

}
