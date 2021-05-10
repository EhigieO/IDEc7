package aftrica.semicolon.tddClass;

public class Calculator {
    public int add(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        return sum;
    }

    public int multiply(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public int subtract(int firstNumber, int secondNumber) {
        int difference = firstNumber - secondNumber;
        return difference;
    }

    public int quotient(int firstNumber, int secondNumber) {

        int quotient = firstNumber / secondNumber;
        return quotient;
    }

}
