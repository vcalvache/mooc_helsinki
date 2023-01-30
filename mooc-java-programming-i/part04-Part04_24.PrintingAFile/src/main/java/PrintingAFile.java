
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        /*
        Write a program that prints the contents of a file called "data.txt",
        such that each line of the file is printed on its own line.

        If the file content looks like so:

        Sample data
        In a
        world

        Then the program should print the following:

        Sample output
        In a
        world
        */
        try (Scanner scanner = new Scanner(Paths.get("data.txt"))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
