import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementTest {

    // 1. Basic Alphabetical Sorting
    @Test
    void testSort_BasicAlphabeticalSorting() {
        BogieSorter sorter = new BogieSorter();
        String[] input = {"Sleeper","AC Chair","First Class","General","Luxury"};
        String[] expected = {"AC Chair","First Class","General","Luxury","Sleeper"};
        assertArrayEquals(expected, sorter.sortBogieNames(input));
    }

    // 2. Unsorted Input
    @Test
    void testSort_UnsortedInput() {
        BogieSorter sorter = new BogieSorter();
        String[] input = {"Luxury","General","Sleeper","AC Chair"};
        String[] expected = {"AC Chair","General","Luxury","Sleeper"};
        assertArrayEquals(expected, sorter.sortBogieNames(input));
    }

    // 3. Already Sorted Array
    @Test
    void testSort_AlreadySortedArray() {
        BogieSorter sorter = new BogieSorter();
        String[] input = {"AC Chair","First Class","General"};
        String[] expected = {"AC Chair","First Class","General"};
        assertArrayEquals(expected, sorter.sortBogieNames(input));
    }

    // 4. Duplicate Bogie Names
    @Test
    void testSort_DuplicateBogieNames() {
        BogieSorter sorter = new BogieSorter();
        String[] input = {"Sleeper","AC Chair","Sleeper","General"};
        String[] expected = {"AC Chair","General","Sleeper","Sleeper"};
        assertArrayEquals(expected, sorter.sortBogieNames(input));
    }

    // 5. Single Element Array
    @Test
    void testSort_SingleElementArray() {
        BogieSorter sorter = new BogieSorter();
        String[] input = {"Sleeper"};
        String[] expected = {"Sleeper"};
        assertArrayEquals(expected, sorter.sortBogieNames(input));
    }
}