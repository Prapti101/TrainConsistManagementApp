import java.util.Arrays;

class BogieBinarySearch {

    // Binary Search method with automatic sorting
    public boolean searchBogie(String[] bogieIds, String key) {
        if (bogieIds == null || bogieIds.length == 0) return false;

        // Ensure sorted
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

    // Print search result
    public void printSearchResult(String key, boolean found) {
        if (found) {
            System.out.println("Bogie ID " + key + " found.");
        } else {
            System.out.println("Bogie ID " + key + " not found.");
        }
    }
}