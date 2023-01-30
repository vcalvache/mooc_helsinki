import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Write a program that first reads book information from the user.
        The details to be asked for each book include the title, the number of pages and the publication year.
        Entering an empty string as the name of the book ends the reading process.

        After this the user is asked for what is to be printed.
        If the user inputs "everything", all the details are printed: the book titles,
        the numbers of pages and the publication years. However, if the user enters the string "name",
        only the book titles are printed.

        It is probably worthwhile to implement a class called Book to represent a book.
        There are two points in total available for this exercise.

        Sample output
        Title: To Kill a Mockingbird
        Pages: 281
        Publication year: 1960
        Title: A Brief History of Time
        Pages: 256
        Publication year: 1988
        Title: Beautiful Code
        Pages: 593
        Publication year: 2007
        Title: The Name of the Wind
        Pages: 662
        Publication year: 2007
        Title:

        What information will be printed? everything
        To Kill a Mockingbird, 281 pages, 1960
        A Brief History of Time, 256 pages, 1988
        Beautiful Code, 593 pages, 2007
        The Name of the Wind, 662 pages, 2007

        Sample output
        Title: To Kill a Mockingbird
        Pages: 281
        Publication year: 1960
        Title: A Brief History of Time
        Pages: 256
        Publication year: 1988
        Title: Beautiful Code
        Pages: 593
        Publication year: 2007
        Title: The Name of the Wind
        Pages: 662
        Publication year: 2007
        Title:

        What information will be printed? name
        To Kill a Mockingbird
        A Brief History of Time
        Beautiful Code
        The Name of the Wind
        */
        
        // implement here the program that allows the user to enter 
        // book information and to examine them

        Scanner reader = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true){
            System.out.print("Title: ");
            String givenTitle = reader.nextLine();
            if (givenTitle.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int totalPages = Integer.valueOf(reader.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(reader.nextLine());
            books.add(new Book(givenTitle, totalPages, publicationYear));
        }
        System.out.print("What information will be printed? ");
        String infoToPrint = reader.nextLine();
        if (infoToPrint.equals("name")){
            for (Book allBooks: books){
                System.out.println(allBooks.getTitle());
            }
        } else if (infoToPrint.equals("everything")){
            for (Book allBooks: books){
                System.out.println(allBooks.toString());
            }
        }
    }
}
