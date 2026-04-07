import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementTest {

    // ✅ 1. Basic Sorting
    @Test
    void testSort_BasicSorting() {
        PassengerBogie pb = new PassengerBogie();

        int[] input = {72, 56, 24, 70, 60};
        int[] expected = {24, 56, 60, 70, 72};

        assertArrayEquals(expected, pb.sortCapacities(input));
    }

    // ✅ 2. Already Sorted
    @Test
    void testSort_AlreadySortedArray() {
        PassengerBogie pb = new PassengerBogie();

        int[] input = {24, 56, 60, 70, 72};
        int[] expected = {24, 56, 60, 70, 72};

        assertArrayEquals(expected, pb.sortCapacities(input));
    }

    // ✅ 3. Duplicate Values
    @Test
    void testSort_DuplicateValues() {
        PassengerBogie pb = new PassengerBogie();

        int[] input = {72, 56, 56, 24};
        int[] expected = {24, 56, 56, 72};

        assertArrayEquals(expected, pb.sortCapacities(input));
    }

    // ✅ 4. Single Element
    @Test
    void testSort_SingleElementArray() {
        PassengerBogie pb = new PassengerBogie();

        int[] input = {50};
        int[] expected = {50};

        assertArrayEquals(expected, pb.sortCapacities(input));
    }

    // ✅ 5. All Equal Values
    @Test
    void testSort_AllEqualValues() {
        PassengerBogie pb = new PassengerBogie();

        int[] input = {40, 40, 40};
        int[] expected = {40, 40, 40};

        assertArrayEquals(expected, pb.sortCapacities(input));
    }
}