package java8.fileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteQuotes {
    public static void main(String[] args) {

        String[] quotes = {"May the Force be with you. - Star Wars",
                "Here's looking at you, kid. - Casablanca",
                "I'll be back. - The Terminator",
                "You can't handle the truth! - A Few Good Men",
                "Life is like a box of chocolates. You never know what you're gonna get. - Forrest Gump",
                "I'm going to make him an offer he can't refuse. - The Godfather",
                "To infinity and beyond! - Toy Story",
                "I feel the need... the need for speed. - Top Gun",
                "Why so serious? - The Dark Knight",
                "There's no place like home. - The Wizard of Oz",
                "Just keep swimming. - Finding Nemo",
                "I see dead people. - The Sixth Sense",
                "You talking to me? - Taxi Driver",
                "Nobody puts Baby in a corner. - Dirty Dancing",
                "You had me at 'hello'. - Jerry Maguire",
                "I'm king of the world! - Titanic",
                "Carpe Diem. Seize the day, boys. - Dead Poets Society",
                "I am Groot. - Guardians of the Galaxy",
                "I'm the king of the world! - Titanic",
                "After all, tomorrow is another day! - Gone with the Wind"
        };

        try (BufferedWriter br =
                     new BufferedWriter(new FileWriter("src/java8/fileHandling/quote.txt"))) {
             int i = 0;
            for (String quote : quotes) {
                br.write(i + 1 +" " + quote+ "\n");
                i++;
            }
            br.close();

        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }

    }
}
