package demos;

import java.util.Scanner;

public class WelcomeMessage {
    
    public static void main() {
    
        String name;
        String date;
        double amount;

        
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();

            System.out.print("Enter the date: ");
            date = scanner.nextLine();

            System.out.print("Enter last transaction amount: ");
            amount = scanner.nextDouble();
        }
        

        String formatedWelcome = String.format("""
            Hi %s, welcome back! Your last login was %s.
            Your last transaction was for +$%.2f""",name, date, amount);
     
        System.out.println(formatedWelcome);
    }
    
}
