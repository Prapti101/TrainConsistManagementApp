import java.util.Arrays;

class BogieSorter {

    public String[] sortBogieNames(String[] bogieNames) {
        Arrays.sort(bogieNames); // Built-in sort
        return bogieNames;
    }

    public void printBogieNames(String[] bogieNames) {
        System.out.println(Arrays.toString(bogieNames));
    }
}