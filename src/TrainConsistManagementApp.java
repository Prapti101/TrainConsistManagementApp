package TrainConsistManagementApp;

import java.util.ArrayList;
import java.util.List;

// Reuse Bogie class from previous UC
class Bogie {

    private String type;
    private int capacity;

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

// UC10 Main Class
public class UC10_TotalSeats {

    public static void main(String[] args) {

        // Step 1: Create bogie list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("General", 90));

        // Step 2: Convert list to stream
        // Step 3: Extract capacity using map()
        // Step 4: Sum using reduce()

        int totalSeats =
                bogies.stream()
                        .map(b -> b.getCapacity())
                        .reduce(0, Integer::sum);

        // Step 5: Display total

        System.out.println(
                "Total Seating Capacity: "
                        + totalSeats
        );
        System.out.println(
                "Total Bogies: "
                        + bogies.size()
        );
    }
}