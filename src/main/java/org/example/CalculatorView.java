package org.example;

import java.util.Scanner;

public class CalculatorView {

    public void CalcView(){
        CalculatorModel calcModel = new CalculatorModel();
        CalculatorController calcController = new CalculatorController();
        Boolean exitApplication = false;
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("*********************************************************************");
        System.out.println("*                     CONSOLE BASED CALCULATOR                      *");
        System.out.println("*********************************************************************");
//        System.out.println();

        while(!exitApplication){
            System.out.println(">>> Enter an option below to continue.");
            System.out.println("<1> Addition");
            System.out.println("<2> Subtraction");
            System.out.println("<3> Multiplication");
            System.out.println("<4> Division");
            System.out.println("<5> Power");
            System.out.println("<6> Square");
            System.out.println("<7> Cube");
            System.out.println("<8> Square Root");
            System.out.println("<9> Round");
            System.out.println("<10> Ceiling");
            System.out.println("<11> Floor");
            System.out.println("<12> Minimum Value");
            System.out.println("<13> Maximum Value");
            System.out.println("<14> sin");
            System.out.println("<15> cos");
            System.out.println("<16> asin");
            System.out.println("<17> acos");
            System.out.println("<18> atan");
            System.out.println("<19> exponential");
            System.out.println("<20> Palindrome");
            System.out.println("<21> Armstrong Number");
            System.out.println("<22> Prime Number");
            System.out.println("<23> Average");
            System.out.println("<24> GCD");
            System.out.println("<25> LCM");

//            This is temporary(to avoid infinite loop)
            exitApplication = true;
        }

    }
}
