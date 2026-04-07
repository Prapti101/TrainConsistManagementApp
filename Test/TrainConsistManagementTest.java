import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementTest {

    // 1. Bogie Found
    @Test
    void testBinarySearch_BogieFound() {
        BogieBinarySearch search = new BogieBinarySearch();
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(search.searchBogie(bogies, "BG309"));
    }

    // 2. Bogie Not Found
    @Test
    void testBinarySearch_BogieNotFound() {
        BogieBinarySearch search = new BogieBinarySearch();
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertFalse(search.searchBogie(bogies, "BG999"));
    }

    // 3. First Element Match
    @Test
    void testBinarySearch_FirstElementMatch() {
        BogieBinarySearch search = new BogieBinarySearch();
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(search.searchBogie(bogies, "BG101"));
    }

    // 4. Last Element Match
    @Test
    void testBinarySearch_LastElementMatch() {
        BogieBinarySearch search = new BogieBinarySearch();
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(search.searchBogie(bogies, "BG550"));
    }

    // 5. Single Element Array
    @Test
    void testBinarySearch_SingleElementArray() {
        BogieBinarySearch search = new BogieBinarySearch();
        String[] bogies = {"BG101"};
        assertTrue(search.searchBogie(bogies, "BG101"));
    }

    // 6. Empty Array
    @Test
    void testBinarySearch_EmptyArray() {
        BogieBinarySearch search = new BogieBinarySearch();
        String[] bogies = {};
        assertFalse(search.searchBogie(bogies, "BG101"));
    }

    // 7. Unsorted Input Handled
    @Test
    void testBinarySearch_UnsortedInputHandled() {
        BogieBinarySearch search = new BogieBinarySearch();
        String[] bogies = {"BG309","BG101","BG550","BG205","BG412"};
        assertTrue(search.searchBogie(bogies, "BG205"));
    }
}