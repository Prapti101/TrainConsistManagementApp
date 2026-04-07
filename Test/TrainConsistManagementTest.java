import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TrainConsistManagementTest {

    // 1. Exception when array is empty
    @Test
    void testSearch_ThrowsExceptionWhenEmpty() {
        BogieSearchWithValidation search = new BogieSearchWithValidation();
        String[] bogies = {};
        Exception exception = assertThrows(IllegalStateException.class, () -> {
            search.searchBogie(bogies, "BG101");
        });
        assertEquals("Cannot search: No bogies exist in the train.", exception.getMessage());
    }

    // 2. Allows search when data exists
    @Test
    void testSearch_AllowsSearchWhenDataExists() {
        BogieSearchWithValidation search = new BogieSearchWithValidation();
        String[] bogies = {"BG101","BG205"};
        assertDoesNotThrow(() -> search.searchBogie(bogies, "BG101"));
    }

    // 3. Bogie found after validation
    @Test
    void testSearch_BogieFoundAfterValidation() {
        BogieSearchWithValidation search = new BogieSearchWithValidation();
        String[] bogies = {"BG101","BG205","BG309"};
        assertTrue(search.searchBogie(bogies, "BG205"));
    }

    // 4. Bogie not found after validation
    @Test
    void testSearch_BogieNotFoundAfterValidation() {
        BogieSearchWithValidation search = new BogieSearchWithValidation();
        String[] bogies = {"BG101","BG205","BG309"};
        assertFalse(search.searchBogie(bogies, "BG999"));
    }

    // 5. Single element valid case
    @Test
    void testSearch_SingleElementValidCase() {
        BogieSearchWithValidation search = new BogieSearchWithValidation();
        String[] bogies = {"BG101"};
        assertTrue(search.searchBogie(bogies, "BG101"));
    }
}