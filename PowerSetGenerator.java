import java.util.ArrayList;

public class PowerSetGenerator {

    // Method to generate the power set of a given set of strings
    public static ArrayList<ArrayList<String>> generatePowerSet(String[] originalSet) {
        ArrayList<ArrayList<String>> powerSet = new ArrayList<>();

        // Calculate the number of subsets
        int powSetSize = (int) Math.pow(2, originalSet.length);

        // Iterate through all possible subsets
        for (int counter = 0; counter < powSetSize; counter++) {
            ArrayList<String> subset = new ArrayList<>();

            // Check each bit of counter
            for (int j = 0; j < originalSet.length; j++) {
                // If the j-th bit is set, include the j-th element in the subset
                if ((counter & (1 << j)) > 0) { //https://www.geeksforgeeks.org/power-set/
                    subset.add(originalSet[j]);
                }
            }

            // Add the subset to the power set
            powerSet.add(subset);
        }

        return powerSet;
    }
}