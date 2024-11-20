package basics;

import java.util.Scanner;

public class FunctionsExerciseSet {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("How much money do you have in savings?: ");
            double savings = in.nextDouble();
            System.out.print("What is the current rate?: ");
            double rate = in.nextDouble();
            System.out.print("How many months into the future do you want to look at?: ");
            double time = in.nextDouble();

            SavingsCalculator(savings, rate, time);

            System.out.print("What was your total bill?: ");
            double bill = in.nextDouble();
            System.out.print("What kinda tip do you want to leave? POOR (16%), GOOD (22%), or GREAT(26%)?: ");
            String tipLevel = in.next();

            TipRecommender(bill, tipLevel);

            System.out.print("How much is the item you want to buy?: ");
            double itemValue = in.nextDouble();
            System.out.print("How much cash are you giving me?: ");
            double cashIn = in.nextDouble();
            KioskChangeCalculator(cashIn, itemValue);

        } catch (Exception e) {
            System.out.println("Sorry invalid input.. numbers only : " + e.getMessage());
        }
        
    }


    public static void SavingsCalculator(double savings, double rate, double time) {

        double futureValue = savings * (1 + (rate / 100) * time);

        String formatedReturn = String.format("""
        After %.0f months, You're future balance will be $%,.2f with a rate of %.1f %%
        """, time, futureValue, rate);
        System.out.println(formatedReturn);
        

    }

    public static void TipRecommender(double ammount, String percentLevel) {

        double returnedValue;
        double totalToPay;
        double percentage;
        String returnedOutput;
        String tipLevel = percentLevel.toUpperCase();
        double calcPercent = switch (tipLevel) {
            case "POOR" -> 0.16;
            case "GOOD" -> 0.22;
            case "GREAT" -> 0.26;
            default -> {
                System.out.println("Sorry invalid option input. Only POOR, GOOD, or GREAT");
                yield 0.0;
            }
        };

        percentage = calcPercent * 100;
        returnedValue = calcPercent * ammount;
        totalToPay = returnedValue + ammount;
        returnedOutput = String.format("""
        You picked %s , thats %.0f %% . making the tip amount $%.4f . 
        You're total is $%.2f .
        """, tipLevel, percentage, returnedValue, totalToPay);

        System.out.println(returnedOutput);
    }

    public static void KioskChangeCalculator(double cashIn , double itemValue) {

        double quarters = 0.25;
        double dimes = 0.10;
        double nickels = 0.05;
        double pennies = 0.01;
        double remander = cashIn - itemValue;
        String returnedText;

        int quartersTotal = (int)(remander / quarters);
        remander = (remander % quarters);

        int dimesTotal = (int)(remander / dimes);
        remander = (remander % dimes);

        int nickelsTotal = (int)(remander / nickels);
        remander = (remander % nickels);

        int penniesTotal = (int)(remander / pennies);
        remander = (remander % pennies);


        returnedText = String.format("""
        You're total is $%.2f, You gave me $%.2f. Here is you're change!
        Quarters: %d
        Dimes: %d
        Nickels: %d
        Pennies: %d
        """, itemValue, cashIn, quartersTotal, dimesTotal, nickelsTotal, penniesTotal);

        System.out.println(returnedText);




    }
}
