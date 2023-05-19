package org.example;

public class CalculatorModel {
    private String expression;
    private int integers;
    private double operand1;
    private double operand2;


    public CalculatorModel(String expression, int integers, double operand1, double operand2) {
        this.expression = expression;
        this.integers = integers;
        this.operand1 = operand1;
        this.operand2 = operand2;

    }

    public CalculatorModel() {}

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public int getIntegers() {
        return integers;
    }

    public void setIntegers(int integers) {
        this.integers = integers;
    }

    public double getOperand1() {
        return operand1;
    }

    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }
}
