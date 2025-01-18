import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) {
        // File name
        String fileName = "example.txt";

        // Writing to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, this is a test.\n");
            writer.write("Java makes file handling easy!");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Reading from the file
        try (Scanner scanner = new Scanner(new File(fileName))) {
            System.out.println("\nReading from file:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
