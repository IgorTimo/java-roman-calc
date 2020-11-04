package online.javalearn.exceptions;

public class TypeIncompatibilityException extends Exception{
    @Override
    public String toString() {
        return "Both numbers have to be or arabic, or roman";
    }
}
