public class SplitArray {
    public static void main(String[] args) {
        // Initial array of 10 elements
        int[] initialArray = {58, 24, 13, 15, 63, 9, 8, 81, 1, 78};

        // Calculate the middle index
        int middleIndex = initialArray.length / 2;

        // Create two arrays for the split
        int[] firstHalf = new int[middleIndex];
        int[] secondHalf = new int[initialArray.length - middleIndex];

        // Copy elements to the first array (from index 0 to middleIndex - 1)
        System.arraycopy(initialArray, 0, firstHalf, 0, middleIndex);

        // Copy elements to the second array (from middleIndex to the end)
        System.arraycopy(initialArray, middleIndex, secondHalf, 0, initialArray.length - middleIndex);

        // Print the initial array
        System.out.println("Initial array:");
        printArray(initialArray);

        // Print the arrays after splitting
        System.out.println("\nAfter splitting:");
        printArray(firstHalf);
        printArray(secondHalf);
    }

    // Helper method to print an array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}