package JavaPrograms;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Subtask 1: Create LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Subtask 2: Read and insert 3 key-value pairs DIRECTLY
        for (int i = 0; i < 3; i++) {
            int key = scan.nextInt();
            String value = scan.next();
            map.put(key, value);
        }

        // Read key to remove
        int x = scan.nextInt();

        // Subtask 3: Remove element with key x
        map.remove(x);

        // Subtask 4: Traverse and print
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        scan.close();
    }
}