package org.example;

public class CalculatorModel {
    private String expression;
    private int powerValue;
    private int operand1;
    private int operand2;

    public CalculatorModel(String expression, int powerValue, int operand1, int operand2) {
        this.expression = expression;
        this.powerValue = powerValue;
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

    public int getPowerValue() {
        return powerValue;
    }

    public void setPowerValue(int powerValue) {
        this.powerValue = powerValue;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
}
