package basics;

import java.util.Scanner;

public class ConditionalLogic {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)){
            /* Runs First
             * Positive or Negative Number
             */
            System.out.print("Give me a positive numer or negative number!");
            double pos_neg = in.nextDouble();
            PositiveOrNegativeNumber(pos_neg);


            /* Runs Second
             * Even or Odd Number
             */
            System.out.print("Give me a number and ill tell you even or odd!: ");
            double even_odd = in.nextDouble();
            EvenOrOdd(even_odd);


            /* Runs Third
             * Letter Grade
             */
            System.out.print("Give me a whole number of the students score and ill return a grade!: ");
            int numGradScore = in.nextInt();
            LetterGradeConverter(numGradScore);


            /* Runs Last
             * Week Day
             */
            System.out.print("Give me a number and ill tell you the day of the week!: ");
            int numDay = in.nextInt();
            WeekDay(numDay);
        } catch (Exception e) {
            System.out.println("Sorry invalid input.. numbers only : " + e.getMessage());
        }
        
    }

    public static void PositiveOrNegativeNumber(double num) {
        if (num < 0) {
            System.out.println("Negative");

        }
        else {
            System.out.println("Positive");
        }
    }

    public static void EvenOrOdd(double num) {
        String format = String.format("%.0f", num);

        if (num % 2 == 0) {
            System.out.println(format + " Is an even number!");
        }
        if (num % 3 == 0) {
            System.out.println(format + " Is an odd number!");
        }
    }

    public static void LetterGradeConverter(int grade) {
        if (grade % 90 < 10) {
            System.out.println("A! Great job!!");
        }
        else if (grade % 80 < 10) {
            System.out.println("B! Not to bad!");
        }
        else if (grade % 72 < 9) {
            System.out.println("C! Not the worst...");
        }
        else if (grade % 64 < 8) {
            System.out.println("D?.. What did i tell you about sleeping in my class...");
        }   
        else {
            System.out.println("F... I... so.. disapointed...");
        }

    }

    public static void WeekDay(int day) {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String inputReturn;


        if (0 < day && day <= 7) {
            inputReturn = daysOfWeek[day - 1];    
            System.out.println(inputReturn);
        }
        else {
            System.out.println("Invalid number has to be 1 to 7");
        }

    }

}
