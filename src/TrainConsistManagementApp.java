import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {

    String type;
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class PerformanceComparisonApp {

    public static List<Bogie> loopFiltering(List<Bogie> bogies) {

        List<Bogie> result = new ArrayList<>();

        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                result.add(b);
            }
        }

        return result;
    }

    public static List<Bogie> streamFiltering(List<Bogie> bogies) {

        return bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            bogies.add(new Bogie("Sleeper", 72));
            bogies.add(new Bogie("Chair", 50));
            bogies.add(new Bogie("FirstClass", 40));
        }

        long startLoop = System.nanoTime();
        List<Bogie> loopResult = loopFiltering(bogies);
        long endLoop = System.nanoTime();

        long loopTime = endLoop - startLoop;

        long startStream = System.nanoTime();
        List<Bogie> streamResult = streamFiltering(bogies);
        long endStream = System.nanoTime();

        long streamTime = endStream - startStream;

        System.out.println("Loop Filtered Count: " + loopResult.size());
        System.out.println("Stream Filtered Count: " + streamResult.size());

        System.out.println("Loop Execution Time (ns): " + loopTime);
        System.out.println("Stream Execution Time (ns): " + streamTime);
    }
}