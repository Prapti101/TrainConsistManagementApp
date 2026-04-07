import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementTest {

    // 1. Bogie Found
    @Test
    void testSearch_BogieFound() {
        BogieSearch search = new BogieSearch();
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(search.searchBogie(bogies, "BG309"));
    }

    // 2. Bogie Not Found
    @Test
    void testSearch_BogieNotFound() {
        BogieSearch search = new BogieSearch();
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertFalse(search.searchBogie(bogies, "BG999"));
    }

    // 3. First Element Match
    @Test
    void testSearch_FirstElementMatch() {
        BogieSearch search = new BogieSearch();
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(search.searchBogie(bogies, "BG101"));
    }

    // 4. Last Element Match
    @Test
    void testSearch_LastElementMatch() {
        BogieSearch search = new BogieSearch();
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(search.searchBogie(bogies, "BG550"));
    }

    // 5. Single Element Array
    @Test
    void testSearch_SingleElementArray() {
        BogieSearch search = new BogieSearch();
        String[] bogies = {"BG101"};
        assertTrue(search.searchBogie(bogies, "BG101"));
    }
}