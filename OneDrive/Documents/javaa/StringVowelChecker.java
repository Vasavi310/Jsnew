class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message);
    }
}

public class StringVowelChecker {
    public static void checkForVowels(String input) throws NoVowelsException {
        if (!input.matches(".*[aeiouAEIOU].*")) {
            throw new NoVowelsException("String must contain at least one vowel.");
        }
    }

    public static void main(String[] args) {
        try {
            String input1 = "Hello";
            checkForVowels(input1);
            System.out.println("String contains vowels.");

            String input2 = "Hmmm";
            checkForVowels(input2);
            System.out.println("String contains vowels.");

        } catch (NoVowelsException e) {
            System.err.println("Exception: " + e.getMessage());
        }
    }
}