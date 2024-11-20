package demos;

import java.util.Scanner;

public class SalaryCalculator {

    public static double calculator() {
        int hours = 40;
        int weekInTheYear = 52;
        int weeksOff;
        double rate;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Whats is your Hourly rate?: ");
            rate = scanner.nextDouble();
            System.out.print("How many vacations weekes in a year?: ");
            weeksOff = scanner.nextInt();
        }
        
        
        double salary =  hours * rate * (weekInTheYear - weeksOff);
        return salary;
    }
    
}
