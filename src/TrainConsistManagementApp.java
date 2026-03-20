import java.util.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        LinkedList<String> consist = new LinkedList<>();

        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        consist.add(2, "Pantry");

        consist.removeFirst();
        consist.removeLast();

        for (String bogie : consist) {
            System.out.println(bogie);
        }
    }
}