package org.example;

public class CalculatorModel {
    private int integers;
    private double operand1;
    private double operand2;
    private double[] array;


    public CalculatorModel( int integers, double operand1, double operand2, double[] array) {
        this.integers = integers;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.array = array;
    }

    public CalculatorModel() {}


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

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
    }
}
