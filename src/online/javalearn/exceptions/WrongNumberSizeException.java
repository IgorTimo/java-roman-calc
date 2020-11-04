package online.javalearn.exceptions;

public class WrongNumberSizeException extends Exception {
    @Override
    public String toString() {
        return "The number must be between one and ten";
    }
}
