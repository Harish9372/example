package JavaPrograms;
import java.util.*;

public class ltimindtree3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Subtask 1: Create LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        int k[] = new int[3];        // key array
        String v[] = new String[3]; // value array

        // Read input key-value pairs
        for (int i = 0; i < 3; i++) {
            k[i] = scan.nextInt();
            v[i] = scan.next();
        }

        // Subtask 2: Insert key-value pairs
        for (int j = 0; j < 3; j++) {
            map.put(k[j], v[j]);
        }

        // Read key to remove
        int x = scan.nextInt();

        // Subtask 3: Remove element with key x
        map.remove(x);

        // Subtask 4: Traverse and print LinkedHashMap
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        scan.close();
    }
}
