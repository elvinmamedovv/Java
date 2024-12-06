import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Birinci ededi daxil edin: ");
            int a = scanner.nextInt();
            System.out.println("Ikinci ededi daxil edin: ");
            int b = scanner.nextInt();

            System.out.println(a / b);
        } catch (ArithmeticException exception) {
            System.out.println("Emeliyyati icra etmek mumkun deyil.");

        }

    }
}
