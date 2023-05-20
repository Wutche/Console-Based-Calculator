package org.example;

import java.util.Arrays;
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
         return "sum of all these numbers :" ;
    }

    @Override
    public String Subtraction(CalculatorModel calculatorModel) {
//        public static void main(String[] args) {
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
//        }
        return null;
    }

    @Override
    public String Multiplication(CalculatorModel calculatorModel) {
//        System.out.print("Enter the number of values you want to multiply: ");
//        int count = scanner.nextInt();
//
//        int product = 1;
//        for (int i = 0; i < count; i++) {
//            System.out.print("Enter value " + (i + 1) + ": ");
//            int number = scanner.nextInt();
//            product *= number;
//        }
//
//        System.out.println("The product is: " + product);
//    }
        return null;
    }

    @Override
    public String Division(CalculatorModel calculatorModel) {
//        public static void main(String[] args) {
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
//        }
        return null;
    }

    @Override
    public String Power(CalculatorModel calculatorModel) {
        double answer = 1;
        int loopStartPoint = 1;
        while(loopStartPoint <= calculatorModel.getIntegers()){
            answer *= calculatorModel.getOperand1();

            loopStartPoint++;
        }
        return "\n>> " + calculatorModel.getOperand1() + " raise to power " + calculatorModel.getIntegers() + " = " + answer;
    }

    @Override
    public String Square(CalculatorModel calculatorModel) {
        double value = calculatorModel.getOperand1();
        double answer = value * value;

        return "\n>> The square of " + calculatorModel.getOperand1() + " = " + answer;
    }

    @Override
    public String Cube(CalculatorModel calculatorModel) {
        double value = calculatorModel.getOperand1();
        double answer = value * value * value;

        return "\n>> The cube of " + calculatorModel.getOperand1() + " = " + answer;
    }

    @Override
    public String SquareRoot(CalculatorModel calculatorModel) {
        return "\n>> The square root of " + calculatorModel.getOperand1() + " = " + Math.sqrt(calculatorModel.getOperand1());
    }

    @Override
    public String Round(CalculatorModel calculatorModel) {
        return "\n>> " + calculatorModel.getOperand1() + " round to the nearest integer is " + Math.round(calculatorModel.getOperand1());

    }

    @Override
    public String Ceiling(CalculatorModel calculatorModel) {
        return "\n>> The ceiling value of " + calculatorModel.getOperand1() + " = " + Math.ceil(calculatorModel.getOperand1());
    }

    @Override
    public String Floor(CalculatorModel calculatorModel) {
        int answer = (int) Math.floor(calculatorModel.getOperand1());
        return "\n>> The floor value of " + calculatorModel.getOperand1() + " = " + answer;
    }

    @Override
    public String MinValue(CalculatorModel calculatorModel) {
        double[] values = calculatorModel.getArray();
        double minimum = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] < minimum) {
                minimum = values[i];
            }
        }
        return "\n>> The minimum value in the array = " + minimum;
    }

    @Override
    public String MaxValue(CalculatorModel calculatorModel) {
        double[] values = calculatorModel.getArray();
        double maximum = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > maximum) {
                maximum = values[i];
            }
        }
        return "\n>> The maximum value in the array = " + maximum;
    }

    @Override
    public String Sin(CalculatorModel calculatorModel) {
        double value = calculatorModel.getOperand1();
        double answer = Math.sin(value);
        return "\n>> Sin(" + value + ") = " + answer;
    }

    @Override
    public String Cosine(CalculatorModel calculatorModel) {
        double value = calculatorModel.getOperand1();
        double answer = Math.cos(value);
        return "\n>> Cos(" + value + ") = " + answer;
    }

    @Override
    public String Asin(CalculatorModel calculatorModel) {
        double value = calculatorModel.getOperand1();
        double answer = Math.asin(value);
        return "\n>> Asin(" + value + ") = " + answer;
    }

    @Override
    public String Acos(CalculatorModel calculatorModel) {
        double value = calculatorModel.getOperand1();
        double answer = Math.acos(value);
        return "\n>> Acos(" + value + ") = " + answer;
    }

    @Override
    public String Atan(CalculatorModel calculatorModel) {
        double value = calculatorModel.getOperand1();
        double answer = Math.atan(value);
        return "\n>> Atan(" + value + ") = " + answer;
    }

    @Override
    public String Exponential(CalculatorModel calculatorModel) {
        double value = calculatorModel.getOperand1();
        double answer = Math.exp(value);
        return "\n>> The exponential of " + value + " = " + answer;
    }

    @Override
    public String Palindrome(CalculatorModel calculatorModel) {
        String value = calculatorModel.getExpression();
        int startPoint = 0;
        int endPoint = value.length() - 1;

        while (startPoint <= endPoint){
            if(value.charAt(startPoint) != value.charAt(endPoint)){
                return "\n>> " + "The expression " + value + " is not a palindrome";
            }

            startPoint++;
            endPoint--;
        }
        return "\n>> " + "The expression " + value + " is a palindrome";
    }

    @Override
    public String ArmstrongNumber(CalculatorModel calculatorModel) {
        int valueLength = String.valueOf(calculatorModel.getIntegers()).length();
        int integer = calculatorModel.getIntegers();
        int result = 0;
        while(integer > 0){
           int number = integer % 10;
           result += Math.pow(number, valueLength);
           integer /= 10;
        }

       if(result != integer){
           return "\n>> " + integer + " is not an Armstrong Number";
       }
        return "\n>> " + integer + " is not an Armstrong Number";
    }

    @Override
    public String PrimeNumber(CalculatorModel calculatorModel) {
        int value = calculatorModel.getIntegers();
        int halfValue = value / 2;
        int i = 2;
        while (i < halfValue){
            if(value % i == 0){
                return "\n>> " + calculatorModel.getIntegers() + " is not a prime number";
            }

            i++;
        }

        return "\n>> " + calculatorModel.getIntegers() + " is a prime number";
    }

    @Override
    public String Average(CalculatorModel calculatorModel) {

        double[] values = calculatorModel.getArray();
        double sum = 0;
        for (int i = 1; i < values.length; i++) {
            sum += values[i];
        }
        double average = sum / values.length;
        return "\n>> The Average value of the numbers is = " + average;
    }

    @Override
    public String GCD(CalculatorModel calculatorModel) {
        double a = calculatorModel.getOperand1();
        double b = calculatorModel.getOperand2();
        int max = (int) Math.max(a, b);

        while(max % a != 0 || max % b != 0){
            max += 1;
        }

        int product = (int) (a * b);
        int GCD = product/max;
        return ">> The GCD of " + a + " and " + b + " = " + GCD;
    }

    @Override
    public String LCM(CalculatorModel calculatorModel) {
        double a = calculatorModel.getOperand1();
        double b = calculatorModel.getOperand2();
        int max = (int) Math.max(a, b);

        while(max % a != 0 || max % b != 0){
            max += 1;
        }
        return ">> The LCM of " + a + " and " + b + " = " + max;
    }
}
