
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        /*
        Let's redo the previous program for handling two liquid containers.
        This time we'll create a class "Container", which is responsible for managing the contents of a container.

        Part 1: Container
        Make a class called Container. The class must have a constructor which does not take any parameters,
        and the following methods:

        - public int contains() which returns the amount of liquid in a container as an integer.
        - public void add(int amount) which adds the amount of liquid given as a parameter to the container.
          If the amount is negative, no liquid is added. A container can hold a maximum of 100 units of liquid.
        - public void remove(int amount) which removes the amount of liquid given as a parameter from the container.
          If the amount is negative, no liquid is removed. A container can never hold less than 0 units of liquid.
        - public String toString() which returns the container as a string formatted "amount of liquid/100,
          for example "32/100".

        The class should work as follows:

            Container container = new Container();
            System.out.println(container);

            container.add(50);
            System.out.println(container);
            System.out.println(container.contains());

            container.remove(60);
            System.out.println(container);

            container.add(200);
            System.out.println(container);
            Sample output
            0/100
            50/100
            50
            0/100
            100/100

        Part 2: Functionality
        Copy the user interface you implemented for the previous example,
        and modify it to use the new Container class. The main method in the class LiquidContainers2
        must start the program.

        Below is some sample output. The user interface should work as follows:

            Sample output
            First: 0/100
            Second: 0/100
            remove 10

            First: 0/100
            Second: 0/100
            add 20

            First: 20/100
            Second: 0/100
            remove 5

            First: 20/100
            Second: 0/100
            move 15

            First: 5/100
            Second: 15/100
            remove 5

            First: 5/100
            Second: 10/100
            remove 20

            First: 5/100
            Second: 0/100
            quit
        */

        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.toString());
            System.out.println("Second: " + second.toString());
            
            String input = scan.nextLine();
            String[] splitedStrings = input.split(" ");
            String command = splitedStrings[0];
            if (command.equals("quit")) {
                break;
            } else if (command.equals("add")){
                int amount = Integer.valueOf(splitedStrings[1]);
                first.add(amount);
            } else if (command.equals("move")){
                int amount = Integer.valueOf(splitedStrings[1]);
                if (first.contains()==0){

                } else if (first.contains() - amount < 0){
                    int diff = (first.contains() - amount) * -1;
                    second.add(amount - diff);
                } else {
                    first.remove(amount);
                second.add(amount);
                }
            } else if (command.equals("remove")){
                int amount = Integer.valueOf(splitedStrings[1]);
                second.remove(amount);
            }
        }
    }
}
