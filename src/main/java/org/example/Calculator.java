package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static final Logger log = LogManager.getLogger(Calculator.class);
    Scanner scanner = new Scanner(System.in);
    public Calculator() {
    }
    public Calculator(int c) {
        double num1, num2;
        do {
            System.out.println("Scientific Calculator using DevOps.");
            System.out.print("1. Square root function\n" +
                    "2.Factorial function \n"+
                    "3.Natural logarithm \n"+
                    "4.Power function \n" +
                    "5. Exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            switch (choice) {
                case 1:
                    // Square root function
                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Square root function of "+num1+" is : " + this.squareRoot(num1));
                    System.out.println("\n");
                    break;
                case 2:
                    // Factorial function
                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Factorial of "+num1+" is : " + this.factorial(num1));
                    System.out.println("\n");
                    break;
                case 3:
                    // Natural logarithm
                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Natural log of "+num1+" is : " + this.naturalLog(num1));
                    System.out.println("\n");
                    break;
                case 4:
                    // Power
                    System.out.print("Enter the first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    System.out.println(num1+ " raised to power "+num2+" is : " + this.power(num1, num2));
                    System.out.println("\n");
                    break;

                default:
                    //Other the above  4 choices..
                    System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }
    public double squareRoot(double num1) {
        log.info("[SQ ROOT]" + num1);
        double result = Math.sqrt(num1);
        log.info("[RESULT-SQ ROOT]" + result);
        return result;
    }
    public double factorial(double num1) {
        log.info("[FACTORIAL]" + num1);
        double facto = 1;
        for (int i = 1; i <= num1; ++i) {
            facto *= i;
            //double result = fact(num1);
            log.info("[RESULT-FACTORIAL]" + facto);
        }
        return facto;
    }
    public double naturalLog(double num1) {
        log.info("[NATURAL LOG]" + num1);;
        double result = 0;
        try {

            if (num1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN 0.0/0.0");
            }
            else {
                result = Math.log(num1);
            }
        } catch (ArithmeticException error) {
            System.out.println("Cannot find log of negative numbers " + error.getLocalizedMessage());
        }
        log.info("[RESULT]-" + result);
        return result;
    }
    public double power(double num1, double num2) {
        log.info("[POWER" + num1 + "RAISED TO] " + num2);
        double result = Math.pow(num1,num2);
        log.info("[RESULT-POWER]" + result);
        return result;
    }
    public static void main(String[] args) {
        //creating the object and calling the class
        Calculator calculator = new Calculator(3);
    }

}
