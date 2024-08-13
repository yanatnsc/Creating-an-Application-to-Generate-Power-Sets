import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        String input;

        // Prompt the user for input
        System.out.println("Enter strings one per line (type 'end' to finish):");

        while (true) {
            // Read a line of input from the user
            input = scanner.nextLine();

            // Check if the user typed 'end'
            if (input.equalsIgnoreCase("end")) {
                break;
            }

            // Check if the string is already in the list
            if (!inputList.contains(input)) {
                inputList.add(input); // Add to the list only if it's not already present
            } else {
                System.out.println("Duplicate entry detected. It will not be added.");
            }
        }

        // Convert input list to an array
        String[] originalSet = new String[inputList.size()];
        for (int i = 0; i < inputList.size(); i++) {
            originalSet[i] = inputList.get(i);
        }

        // Generate the power set
        ArrayList<ArrayList<String>> powerSet = PowerSetGenerator.generatePowerSet(originalSet);

        // Display the power set using a traditional for loop
        System.out.println("Power Set:");
        for (int i = 0; i < powerSet.size(); i++) {
            System.out.println(powerSet.get(i));
        }

        // Close the scanner
        scanner.close();
    }
}
