package TrainConsistManagementApp;

import java.util.*;
import java.util.stream.Collectors;

// Reuse Bogie class (same as UC7 & UC8)
class Bogie {

    private String type;
    private int capacity;

    // Constructor
    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    // Getter
    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    // Display
    @Override
    public String toString() {
        return "Bogie Type: " + type +
                ", Capacity: " + capacity;
    }
}

// UC9 Main Class
public class UC9_GroupBogies {

    public static void main(String[] args) {

        // Step 1: Create Bogie List (reuse previous UC list)

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));

        // Step 2: Convert list into Stream
        // Step 3: Apply groupingBy()

        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(
                                b -> b.getType()
                        ));

        // Step 4: Display grouped bogies

        System.out.println("Grouped Bogies by Type:");

        for (String key : groupedBogies.keySet()) {

            System.out.println("\nType: " + key);

            List<Bogie> group = groupedBogies.get(key);

            for (Bogie b : group) {
                System.out.println(b);
            }
        }

        // Verify original list unchanged
        System.out.println("\nOriginal List Size: "
                + bogies.size());
    }
}