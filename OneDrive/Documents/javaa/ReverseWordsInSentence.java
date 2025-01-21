import java.util.Scanner;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        // Read a sentence from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        scanner.close();

        // Print the reverse of each word in the sentence
        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed Words in the Sentence: " + reversedSentence);
    }

    // Method to reverse each word in a sentence
    private static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            // Reverse each word
            String reversedWord = new StringBuilder(word).reverse().toString();

            // Append the reversed word to the result
            reversedSentence.append(reversedWord).append(" ");
        }

        // Remove the trailing space and return the result
        return reversedSentence.toString().trim();
    }
}