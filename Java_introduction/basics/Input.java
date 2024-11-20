package basics;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String userInput = in.nextLine();

            System.out.println("Hello " + userInput);

            System.out.print("How old are you?: ");
            int userAge = in.nextInt();

            System.out.println("Dang! " + userInput + " are you really " + userAge + "!!");

        } catch (Exception error) {
            System.out.println("Sorry we incounter and error. :" + error.getMessage());
        }


    }

}
