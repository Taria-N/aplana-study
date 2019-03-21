import java.io.*;

public class Task18 {
    public static void main(String[] args) {
        String s;
        int i = 0;
        try{
            BufferedReader buf = new BufferedReader(new FileReader("file.txt"));
            while ((s = buf.readLine()) !=null) {
                System.out.println(s);
                i++;
            }
        }
        catch (IOException e) {
            System.out.println("Ошибка ввода - вывода" + e);
        }
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Требуется ввести " + i + " строк");
        try (FileWriter fw = new FileWriter("file.txt")
        ) {
            for (int n = 0; n<i; n++){
                s = br.readLine();

                s = s + "\r\n";
                fw.write(s);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода - вывода" + exc);
        }

    }
}
