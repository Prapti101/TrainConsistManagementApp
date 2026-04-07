class BogieSearch {

    // Linear Search Method
    public boolean searchBogie(String[] bogieIds, String key) {
        for (String id : bogieIds) {
            if (id.equals(key)) {  // Compare using equals()
                return true;       // Found
            }
        }
        return false;              // Not found
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