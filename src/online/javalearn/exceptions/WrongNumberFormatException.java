package online.javalearn.exceptions;

public class WrongNumberFormatException extends Exception {
    @Override
    public String toString() {
        return "It's wrong format of number. Use only arabic or roman from 1 till 10";
    }
}
