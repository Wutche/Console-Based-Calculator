package org.example;

import java.util.Scanner;

public class CalculatorView {

    public void CalcView(){
        CalculatorModel calcModel = new CalculatorModel();
        CalculatorController calcController = new CalculatorController();
        Boolean exitApplication = false;
        Scanner input = new Scanner(System.in);
        String answer = "";

        System.out.println();

//        System.out.println();

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
            System.out.println("| <24> GCD                                                          |");
            System.out.println("| <25> LCM                                                          |");
            System.out.println("| <26> Exit                                                         |");
            System.out.println("|+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++|");

            System.out.println("");
            System.out.println(">>> Enter an option below to continue.");
            System.out.print(">> ");
            int option = input.nextInt();
//            This is temporary(to avoid infinite loop)

            switch(option){
                case 1:
                    System.out.println("");
                    System.out.println("Please enter the expression. Example is '5+5+5'");
                    System.out.print(">> ");
                    calcModel.setExpression(input.next());
                    System.out.println(calcController.Addition(calcModel));
                    System.out.println();
                    System.out.println("Do you want to perform another calculation? if yes, write yes, else enter any key");
                    System.out.print(">> ");
                    answer = input.next();
                    System.out.println();
                    if(answer.equalsIgnoreCase("yes")){
                        break;
                    }else{
                        System.out.println("Thank you for using our calculator. Have a nice day!");
                        exitApplication = true;
                    }


                case 2:
                    System.out.println("");
                    System.out.println("Please enter the expression. Example is '5-5-5'");
                    System.out.print(">> ");
                    calcModel.setExpression(input.next());
                    System.out.println(calcController.Subtraction(calcModel));
                    System.out.println();
                    System.out.println("Do you want to perform another calculation? if yes, write yes, else enter any key");
                    System.out.print(">> ");
                    answer = input.next();
                    System.out.println();
                    if(answer.equalsIgnoreCase("yes")){
                        break;
                    }else{
                        System.out.println("Thank you for using our calculator. Have a nice day!");
                        exitApplication = true;
                    }
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("Please enter the expression. Example is '5x5x5'");
                    System.out.print(">> ");
                    calcModel.setExpression(input.next());
                    System.out.println(calcController.Multiplication(calcModel));
                    System.out.println();
                    System.out.println("Do you want to perform another calculation? if yes, write yes, else enter any key");
                    System.out.print(">> ");
                    answer = input.next();
                    System.out.println();
                    if(answer.equalsIgnoreCase("yes")){
                        break;
                    }else{
                        System.out.println("Thank you for using our calculator. Have a nice day!");
                        exitApplication = true;
                    }
                    break;

                case 4:
                    System.out.println("");
                    System.out.println("Please enter the expression. Example is '5/5/5'");
                    System.out.print(">> ");
                    calcModel.setExpression(input.next());
                    System.out.println(calcController.Division(calcModel));
                    System.out.println();
                    System.out.println("Do you want to perform another calculation? if yes, write yes, else enter any key");
                    System.out.print(">> ");
                    answer = input.next();
                    System.out.println();
                    if(answer.equalsIgnoreCase("yes")){
                        break;
                    }else{
                        System.out.println("Thank you for using our calculator. Have a nice day!");
                        exitApplication = true;
                    }
                    break;

                case 5:
                    System.out.println("");
                    System.out.println("Please enter the value you want to raise to power");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextInt());
                    System.out.println("Please enter the power");
                    System.out.print(">> ");
                    calcModel.setPowerValue(input.nextInt());
                    System.out.println(calcController.Power(calcModel));
                    System.out.println();
                    System.out.println("Do you want to perform another calculation? if yes, write yes, else enter any key");
                    System.out.print(">> ");
                    answer = input.next();
                    System.out.println();
                    if(answer.equalsIgnoreCase("yes")){
                        break;
                    }else{
                        System.out.println("Thank you for using our calculator. Have a nice day!");
                        exitApplication = true;
                    }
                    break;

                case 6:
                    System.out.println("");
                    System.out.println("Please enter the number you want to square");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextInt());
                    System.out.println(calcController.Square(calcModel));
                    System.out.println();
                    System.out.println("Do you want to perform another calculation? if yes, write yes, else enter any key");
                    System.out.print(">> ");
                    answer = input.next();
                    System.out.println();
                    if(answer.equalsIgnoreCase("yes")){
                        break;
                    }else{
                        System.out.println("Thank you for using our calculator. Have a nice day!");
                        exitApplication = true;
                    }
                    break;

                case 7:
                    System.out.println("");
                    System.out.println("Please enter the number you want to cube");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextInt());
                    System.out.println(calcController.Cube(calcModel));
                    System.out.println();
                    System.out.println("Do you want to perform another calculation? if yes, write yes, else enter any key");
                    System.out.print(">> ");
                    answer = input.next();
                    System.out.println();
                    if(answer.equalsIgnoreCase("yes")){
                        break;
                    }else{
                        System.out.println("Thank you for using our calculator. Have a nice day!");
                        exitApplication = true;
                    }
                    break;

                case 8:
                    System.out.println("");
                    System.out.println("Please enter the number you want to get the square root of");
                    System.out.print(">> ");
                    calcModel.setOperand1(input.nextInt());
                    System.out.println(calcController.SquareRoot(calcModel));
                    System.out.println();
                    System.out.println("Do you want to perform another calculation? if yes, write yes, else enter any key");
                    System.out.print(">> ");
                    answer = input.next();
                    System.out.println();
                    if(answer.equalsIgnoreCase("yes")){
                        break;
                    }else{
                        System.out.println("Thank you for using our calculator. Have a nice day!");
                        exitApplication = true;
                    }
                    break;

                default:
                    System.out.println("Thank you for using our calculator. Have a nice day!");
                    exitApplication = true;
            }

        }

    }
}
