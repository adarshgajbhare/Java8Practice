package java8.fileHandling;

import java.io.*;
import java.nio.file.*;

public class FileHandling {


    public static void main(String[] args) {
        String fileName = "src/java8/fileHandling/input.txt"; // Adjust if necessary
 // Assuming input.txt is in the same package

        // Try-with-resources to ensure the file is closed properly
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read each line and print it to the console
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/java8/fileHandling/output.txt") )){
            writer.write("Adarsh is writing in output file \n");
            writer.write("2222 + 553");
            writer.write(Integer.toString(7474 + 999999));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
