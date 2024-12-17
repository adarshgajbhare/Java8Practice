package java8.fileHandling;

import java.io.*;

public class ReadQuotes {
    public static void main(String[] args) throws IOException {
        File file = new File("newFile.txt");
        if (file.createNewFile()) {
            System.out.println("File created successfully.");
        } else {
            System.out.println("File already exists.");

        }
        try (BufferedReader br = new BufferedReader(new FileReader("src/java8/fileHandling/quote.txt"))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
