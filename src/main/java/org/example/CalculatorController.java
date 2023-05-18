package org.example;

import java.util.Scanner;

public class  CalculatorController implements CalculatorInterface{
    @Override
    public String Addition(CalculatorModel calculatorModel) {
        int count;
//        System.out.println("Enter count of numbers : ");
        Scanner sc = new  Scanner(System.in);
        count = sc.nextInt();
        int number, sum = 0;
        for(int i=0;i < count;i++){
            number = sc.nextInt();
            sum = sum + number;
        }
         return "sum of all these numbers :" + sum;
    }

    @Override
    public String Subtraction(CalculatorModel calculatorModel) {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of values you want to subtract: ");
            int count = scanner.nextInt();

            int result = 0;

            for (int i = 0; i < count; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int number = scanner.nextInt();

                if (i == 0) {
                    result = number; // Set the initial value
                } else {
                    result -= number; // Subtract the subsequent numbers
                }
            }

            System.out.println("Result: " + result);

            scanner.close();
        }
    }

    @Override
    public String Multiplication(CalculatorModel calculatorModel) {
        System.out.print("Enter the number of values you want to multiply: ");
        int count = scanner.nextInt();

        int product = 1;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            int number = scanner.nextInt();
            product *= number;
        }

        System.out.println("The product is: " + product);
    }
    }

    @Override
    public String Division(CalculatorModel calculatorModel) {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of values to divide: ");
            int count = scanner.nextInt();

            double[] numbers = new double[count];

            System.out.println("Enter the values:");

            for (int i = 0; i < count; i++) {
                System.out.print("Value " + (i + 1) + ": ");
                numbers[i] = scanner.nextDouble();
            }

            double result = numbers[0]; // Start with the first number

            for (int i = 1; i < count; i++) {
                result /= numbers[i]; // Divide the result by each subsequent number
            }

            System.out.println("Result: " + result);

            scanner.close();
        }
    }

    @Override
    public String Power(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String Square(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String Cube(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String SquareRoot(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String Round(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String Ceiling(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String Floor(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String MinValue(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String MaxValue(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String Sin(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String Cosine(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String Asin(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String Acos(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String Atan(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String Exponential(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String Palindrome(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String ArmstrongNumber(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String PrimeNumber(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String Average(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String GCD(CalculatorModel calculatorModel) {
        return null;
    }

    @Override
    public String LCM(CalculatorModel calculatorModel) {
        return null;
    }
}
