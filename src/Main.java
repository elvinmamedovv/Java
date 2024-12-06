import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(12345, "Elvin");
        map.put(54321, "Kanan");
        map.put(67890, "Asif");


        Scanner scanner = new Scanner(System.in);
        System.out.print("Identifikasiya nomresini daxil edin: ");
        int a = scanner.nextInt();
        if (a == 12345) {
            System.out.println("Istirakcii: " + map.get(12345));
        } else if (a == 54321) {
            System.out.println("Istirakcii: " + map.get(54321));
        } else if (a == 67890) {
            System.out.println("Istirakcii: " + map.get(67890));
        } else {
            System.out.println("Istirakci tapilmadi");
        }


        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {

            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue() + " ");

        }


    }
}
