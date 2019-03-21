import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task16 {
    public static void main(String[] args) {
        String s;
        try{
            BufferedReader buf = new BufferedReader(new FileReader("file.txt"));
            while ((s = buf.readLine()) !=null) {
                System.out.println(s);
            }
            }
        catch (IOException e) {
            System.out.println("Ошибка ввода - вывода" + e);
        }

        }
    }

