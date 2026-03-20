import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Sleeper", 72);
        map.put("AC Chair", 60);
        map.put("First Class", 40);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}