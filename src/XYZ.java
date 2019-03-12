import java.util.Scanner;
public class XYZ {
    static int srednee(int x, int y, int z) {
       return (x + y + z) / 3;

    }

    public static void main(String[] argx) {
        Scanner in = new Scanner(System.in);
        int x, y, z;
        System.out.println("Введите Первое число ");
        x = in.nextInt();
        System.out.println("Введите второе число ");
        y = in.nextInt();
        System.out.println("Введите третье число");
        z = in.nextInt();
        int s = srednee(x, y, z);
        System.out.println(s);
        if (s%2==0) {
            System.out.println("Это четное число");

        }
        else {
            System.out.println("Это нечетное число");
        }
        if (s >3 ) {
            System.out.println("Программа выполнена корректно");
        }

    }
}

