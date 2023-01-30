import javax.xml.stream.events.StartDocument;

public class Printer {

    public static void main(String[] args) {

        /*
        Complete the method public static void printArrayInStars(int[] array) in the class named 'Printer'
        to make it print a row of stars for each number in the array.
        The amount of stars on each row is defined by the corresponding number in the array.

        You can try out the printing with this example:

        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
        Sample output

        *****
        *
        ***
        ****
        **
        */

        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here
        for (int i = 0; i < array.length; i++){
            printStars(array[i]);
            System.out.println();
        }
    }

    public static void printStars(int starsNumber){
        for (int i = 0; i < starsNumber; i++){
            System.out.print("*");
        }
    }

}
