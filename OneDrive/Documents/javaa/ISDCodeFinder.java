import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ISDCodeFinder {
    public static void main(String[] args) {
        // Create a HashMap to store the country names and their respective ISD codes
        Map<String, String> isdCodes = new HashMap<>();
        isdCodes.put("India", "91");
        isdCodes.put("Pakistan", "92");
        isdCodes.put("South Africa", "27");
        isdCodes.put("United States", "1");
        isdCodes.put("China", "86");
        isdCodes.put("Australia", "61");
        isdCodes.put("Japan", "81");

        // Input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Country name");
        String countryName = scanner.nextLine().trim();

        // Lookup the ISD code based on the user input
        String isdCode = isdCodes.get(countryName);

        // Output the result
        if (isdCode != null) {
            System.out.println(isdCode);
        } else {
            System.out.println("ISD code not found for the given country name.");
        }

        scanner.close();
    }
}
