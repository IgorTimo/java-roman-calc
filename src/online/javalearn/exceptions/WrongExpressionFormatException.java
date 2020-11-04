package online.javalearn.exceptions;

public class WrongExpressionFormatException extends Exception {
    @Override
    public String toString() {
        return "It's wrong expression format. Print two numbers (arabic or roman) with one arithmetic sign between them.";
    }
}
