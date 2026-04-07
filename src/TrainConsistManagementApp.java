import java.util.Arrays;

class BogieSearchWithValidation {

    // Search with defensive validation
    public boolean searchBogie(String[] bogieIds, String key) {
        // Defensive programming: check empty array
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("Cannot search: No bogies exist in the train.");
        }

        // Optional: sort before binary search if required
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = key.compareTo(bogieIds[mid]);

            if (cmp == 0) {
                return true; // found
            } else if (cmp < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false; // not found
    }

    // Print result method
    public void printSearchResult(String key, boolean found) {
        if (found) {
            System.out.println("Bogie ID " + key + " found.");
        } else {
            System.out.println("Bogie ID " + key + " not found.");
        }
    }
}