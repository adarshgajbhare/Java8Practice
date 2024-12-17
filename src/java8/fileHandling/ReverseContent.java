package java8.fileHandling;

import java.io.*;
/**
 * Reverse Content of a File
 * Write a program that reads the contents of a file, reverses the
  content (character by character), and writes the reversed content into a new file.
 * Example:
 * Input file: hello.txt containing "Hello World!"
 * Output file: reversed.txt containing "!dlroW olleH"
**/
public class ReverseContent {

    public static void main(String[] args) {

        reverseString();

    }

    private static void reverseString() {

        try (BufferedReader reader = new BufferedReader(new FileReader("src/java8/fileHandling/hello.txt"))) {
            StringBuffer sb = new StringBuffer(reader.readLine());
            String rev = sb.reverse().toString();
            System.out.println(rev);
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/java8/fileHandling/helloRev.txt"))) {
                writer.write(rev);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
