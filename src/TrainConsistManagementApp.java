package TrainConsistManagementApp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Bogie Class (reuse from UC7 if already created)
class Bogie {
    String type;
    int capacity;

    // Constructor
    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    // Getter
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

// UC8 Class
public class UC8_FilterPassengerBogies {

    public static void main(String[] args) {

        // Step 1: Create Bogie List (reuse UC7 list)
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("General", 90));

        // Step 2: Convert list to stream
        // Step 3: Apply filter
        // Step 4: Collect into new list

        List<Bogie> filteredBogies =
                bogies.stream()
                        .filter(b -> b.getCapacity() > 60)
                        .collect(Collectors.toList());

        // Step 5: Display filtered bogies
        System.out.println("Filtered Passenger Bogies (Capacity > 60):");

        for (Bogie b : filteredBogies) {
            System.out.println(b);
        }

        // Verify original list unchanged
        System.out.println("\nOriginal Bogie List:");

        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}