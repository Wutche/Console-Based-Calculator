package org.example;

import java.util.Scanner;

public class CalculatorView {

    public void CalcView(){
        CalculatorModel calcModel = new CalculatorModel();
        CalculatorController calcController = new CalculatorController();
        boolean exitApplication = false;
        Scanner input = new Scanner(System.in);
        String answer;

        System.out.println();

        while(!exitApplication){
            System.out.println("|+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
            System.out.println("|                     CONSOLE BASED CALCULATOR                      |");
            System.out.println("|+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
            System.out.println("| <1> Addition                                                      |");
            System.out.println("| <2> Subtraction                                                   |");
            System.out.println("| <3> Multiplication                                                |");
            System.out.println("| <4> Division                                                      |");
            System.out.println("| <5> Power                                                         |");
            System.out.println("| <6> Square                                                        |");
            System.out.println("| <7> Cube                                                          |");
            System.out.println("| <8> Square Root                                                   |");
            System.out.println("| <9> Round                                                         |");
            System.out.println("| <10> Ceiling                                                      |");
            System.out.println("| <11> Floor                                                        |");
            System.out.println("| <12> Minimum Value                                                |");
            System.out.println("| <13> Maximum Value                                                |");
            System.out.println("| <14> sin                                                          |");
            System.out.println("| <15> cos                                                          |");
            System.out.println("| <16> asin                                                         |");
            System.out.println("| <17> acos                                                         |");
            System.out.println("| <18> atan                                                         |");
            System.out.println("| <19> exponential                                                  |");
            System.out.println("| <20> Palindrome                                                   |");
            System.out.println("| <21> Armstrong Number                                             |");
            System.out.println("| <22> Prime Number                                                 |");
            System.out.println("| <23> Average                                                      |");
            System.out.println("| <24> GCD of two numbers                                           |");
            System.out.println("| <25> LCM of two numbers                                           |");
            System.out.println("| <26> Exit                                                         |");
            System.out.println("|+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");

            System.out.println();
            System.out.println(">>> Enter an option below to continue.");
            System.out.print(">> ");
            int option = input.nextInt();

            switch(option){
                case 1:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                           ADDITION                             |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the number of operands expected");
                    System.out.print(">> ");
                    int additionEntries = input.nextInt();
                    double[] additionArr = new double[additionEntries];
                    for(int i = 0; i < additionEntries; i++){
                        if(i == 0){
                            System.out.println(">> Please enter the first operand");
                            System.out.print(">> ");
                            additionArr[i] = input.nextDouble();
                            continue;
                        }

                        System.out.println(">> Please enter the next operand");
                        System.out.print(">> ");
                        additionArr[i] = input.nextDouble();
                    }
                    calcModel.setArray(additionArr);
                    System.out.println(calcController.Addition(calcModel));
                    break;

                case 2:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                           SUBTRACTION                          |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the number of operands expected");
                    System.out.print(">> ");
                    int subtractionEntries = input.nextInt();
                    double[] subtractionArr = new double[subtractionEntries];
                    for(int i = 0; i < subtractionEntries; i++){
                        if(i == 0){
                            System.out.println(">> Please enter the first operand");
                            System.out.print(">> ");
                            subtractionArr[i] = input.nextDouble();
                            continue;
                        }

                        System.out.println(">> Please enter the next operand");
                        System.out.print(">> ");
                        subtractionArr[i] = input.nextDouble();
                    }
                    calcModel.setArray(subtractionArr);
                    System.out.println(calcController.Subtraction(calcModel));
                    break;

                case 3:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                         MULTIPLICATION                         |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the number of operands expected");
                    System.out.print(">> ");
                    int multiplicationEntries = input.nextInt();
                    double[] multiplicationArr = new double[multiplicationEntries];
                    for(int i = 0; i < multiplicationEntries; i++){
                        if(i == 0){
                            System.out.println(">> Please enter the first operand");
                            System.out.print(">> ");
                            multiplicationArr[i] = input.nextDouble();
                            continue;
                        }

                        System.out.println(">> Please enter the next operand");
                        System.out.print(">> ");
                        multiplicationArr[i] = input.nextDouble();
                    }
                    calcModel.setArray(multiplicationArr);
                    System.out.println(calcController.Multiplication(calcModel));
                    break;

                case 4:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                           DIVISION                             |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the number of operands expected");
                    System.out.print(">> ");
                    int divisionEntries = input.nextInt();
                    double[] divisionArr = new double[divisionEntries];
                    for(int i = 0; i < divisionEntries; i++){
                        if(i == 0){
                            System.out.println(">> Please enter the first operand");
                            System.out.print(">> ");
                            divisionArr[i] = input.nextDouble();
                            continue;
                        }

                        System.out.println(">> Please enter the next operand");
                        System.out.print(">> ");
                        divisionArr[i] = input.nextDouble();
                    }
                    calcModel.setArray(divisionArr);
                    System.out.println(calcController.Division(calcModel));
                    break;

                case 5:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                            POWER                               |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the base number");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println(">> Please enter the power");
                    System.out.print(">> ");
                    calcModel.setIntegers(input.nextInt());
                    System.out.println(calcController.Power(calcModel));
                    break;

                case 6:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                            SQUARE                              |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the base number");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println(calcController.Square(calcModel));
                    break;

                case 7:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                             CUBE                               |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the base number");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println(calcController.Cube(calcModel));
                    break;

                case 8:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                          SQUARE ROOT                           |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the base number");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println(calcController.SquareRoot(calcModel));

                case 9:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                             ROUND                              |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the number you want to Round to the nearest integer");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println(calcController.Round(calcModel));
                    break;

                case 10:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                            CEILING                             |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the number whose ceil value is to be determined");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println(calcController.Ceiling(calcModel));
                    break;

                case 11:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                            FLOOR                               |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the number whose floor value is to be determined");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println(calcController.Floor(calcModel));
                    System.out.println();
                    break;

                case 12:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                        MINIMUM VALUE                           |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the number of entries expected");
                    System.out.print(">> ");
                    int minEntries = input.nextInt();
                    double[] minArr = new double[minEntries];
                    for(int i = 0; i < minEntries; i++){
                        if(i == 0){
                            System.out.println(">> Please enter the first number");
                            System.out.print(">> ");
                            minArr[i] = input.nextDouble();
                            continue;
                        }

                        System.out.println(">> Please enter the next number");
                        System.out.print(">> ");
                        minArr[i] = input.nextDouble();
                    }
                    calcModel.setArray(minArr);
                    System.out.println(calcController.MinValue(calcModel));
                    break;

                case 13:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                        MAXIMUM VALUE                           |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the number of entries expected");
                    System.out.print(">> ");
                    int maxEntries = input.nextInt();
                    double[] maxArr = new double[maxEntries];
                    for(int i = 0; i < maxEntries; i++){
                        if(i == 0){
                            System.out.println(">> Please enter the first number");
                            System.out.print(">> ");
                            maxArr[i] = input.nextDouble();
                            continue;
                        }

                        System.out.println(">> Please enter the next number");
                        System.out.print(">> ");
                        maxArr[i] = input.nextDouble();
                    }
                    calcModel.setArray(maxArr);
                    System.out.println(calcController.MaxValue(calcModel));
                    break;

                case 14:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                             SINE                               |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the angle");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println(calcController.Sin(calcModel));
                    break;

                case 15:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                            COSINE                              |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the angle");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println(calcController.Cosine(calcModel));
                    break;

                case 16:
                    System.out.println();

                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                            ARC-SINE                             |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the angle");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println(calcController.Asin(calcModel));
                    break;

                case 17:
                    System.out.println();

                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                           ARC-COSINE                            |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the angle");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println(calcController.Acos(calcModel));
                    break;

                case 18:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                          ARC-TANGENT                            |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the angle");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println(calcController.Atan(calcModel));
                    break;

                case 19:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                         EXPONENTIAL                            |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the number, whose exponential is to be determined");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println(calcController.Exponential(calcModel));
                    break;

                case 20:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                          PALINDROME                            |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the argument which is to be checked for palindrome");
                    System.out.print(">> ");
                    calcModel.setExpression(input.next());
                    System.out.println(calcController.Palindrome(calcModel));
                    break;

                case 21:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                       ARMSTRONG NUMBER                         |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the number to confirm if it is an armstrong number");
                    System.out.print(">> ");
                    calcModel.setIntegers(input.nextInt());
                    System.out.println(calcController.ArmstrongNumber(calcModel));
                    break;

                case 22:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                         PRIME NUMBER                           |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the number to confirm if it is a prime number");
                    System.out.print(">> ");
                    calcModel.setIntegers(input.nextInt());
                    System.out.println(calcController.PrimeNumber(calcModel));
                    break;

                case 23:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                           AVERAGE                              |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the number of entries expected");
                    System.out.print(">> ");
                    int entries = input.nextInt();
                    double[] arr = new double[entries];
                    for(int i = 0; i < entries; i++){
                        if(i == 0){
                            System.out.println(">> Please enter the first number");
                            System.out.print(">> ");
                            arr[i] = input.nextDouble();
                            continue;
                        }

                        System.out.println(">> Please enter the next number");
                        System.out.print(">> ");
                        arr[i] = input.nextDouble();
                    }
                    calcModel.setArray(arr);
                    System.out.println(calcController.Average(calcModel));
                    break;

                case 24:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                      GCD OF TWO NUMBERS                        |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the first operand");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println("Please enter the second operand");
                    System.out.print(">> ");
                    calcModel.setOperand2(input.nextDouble());
                    System.out.println(calcController.GCD(calcModel));
                    break;

                case 25:
                    System.out.println();
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println("|                      LCM OF TWO NUMBERS                        |");
                    System.out.println("|++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");
                    System.out.println();
                    System.out.println(">> Please enter the first operand");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextDouble());
                    System.out.println(">> Please enter the second operand");
                    System.out.print(">> ");
                    calcModel.setOperand2(input.nextDouble());
                    System.out.println(calcController.LCM(calcModel));
                    break;

                case 26:
                    System.out.println();
                    System.out.println(">> Thank you for using our calculator. Have a nice day!");
                    exitApplication = true;
                    break;

                default:
                    System.out.println();
                    System.out.println(">> Incorrect Option");
            }

            if(!exitApplication){
                System.out.println();
                System.out.println(">> Do you want to perform another calculation? if yes, write yes, else enter any key");
                System.out.print(">> ");
                answer = input.next();
                System.out.println();
                if(!answer.equalsIgnoreCase("yes")){
                    System.out.println(">> Thank you for using our calculator. Have a nice day!");
                    exitApplication = true;
                }
            }



        }

    }


}
