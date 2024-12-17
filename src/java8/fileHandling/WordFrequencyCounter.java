package java8.fileHandling;

import java.io.*;

/**
 *Word Frequency Counter
 * Create a program that reads a text file and counts the frequency of each word, then writes the word frequencies to another file in alphabetical order.
 * Example:
 * Input file: "Java is fun. Java is powerful."
 * Output file:
 * kotlin
 * Copy code
 * fun: 1
 * is: 2
 * Java: 2
 * powerful: 1
 * */
public class WordFrequencyCounter {
    public static void main(String[] args) throws IOException {

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/java8/fileHandling/wordFreq.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("src/java8/fileHandling/wordFreqResult.txt"))){

            String line;
           
            while ((line = bufferedReader.readLine())!= null) {
                //System.out.println(line);
            }

        }
    }
}
