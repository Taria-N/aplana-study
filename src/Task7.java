import java.util.Scanner;

public class Task7 {
    static final int X = 1;
    static final int Y = 3;
    static final int Z = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    if (t == X || t == Y || t == Z) {
        System.out.println("Данное значение имеется в константах");}
    else {
        System.out.println("Такой константы нет!");
    }
    }
}
