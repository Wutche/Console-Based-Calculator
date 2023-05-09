package org.example;

public class CalculatorModel {
    private String userInput;

    public CalculatorModel(String userInput) {
        this.userInput = userInput;
    }
    public CalculatorModel(){};

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }


}
