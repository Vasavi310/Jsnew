import java.io.File;
import java.io.IOException;

public class FileClassExample {

    public static void main(String[] args) {
        // Specify a file path
        String filePath = "file1.txt";
        String directoryPath = "exampleDirectory";

        // Create a File object for the specified file path
        File file = new File(filePath);
        File directory = new File(directoryPath);

        // Demonstrate canRead() method
        System.out.println("File is readable: " + file.canRead());

        // Demonstrate createNewFile() method
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }

        // Demonstrate exists() method
        System.out.println("File exists: " + file.exists());

        // Demonstrate mkdir() method for creating a directory
        if (!directory.exists()) {
            if (directory.mkdir()) {
                System.out.println("Directory created successfully");
            } else {
                System.out.println("Failed to create directory");
            }
        } else {
            System.out.println("Directory already exists");
        }

        // Demonstrate delete() method
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully");
            } else {
                System.out.println("Failed to delete file");
            }
        } else {
            System.out.println("File does not exist");
        }

        // Demonstrate delete() method for deleting a directory
        if (directory.exists()) {
            if (directory.delete()) {
                System.out.println("Directory deleted successfully");
            } else {
                System.out.println("Failed to delete directory");
            }
        } else {
            System.out.println("Directory does not exist");
        }
    }
}