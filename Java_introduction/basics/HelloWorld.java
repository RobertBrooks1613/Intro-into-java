package basics;

import demos.SalaryCalculator;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        double returned_rate;
        
        
        returned_rate = SalaryCalculator.calculator();
        System.out.println(returned_rate);
    }
}
