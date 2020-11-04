package online.javalearn.exceptions;

public class WrongArithmeticSymbolException extends Exception{
    @Override
    public String toString() {
        return "There is no such arithmetic symbol in this calculator. Use only -, +, *, /";
    }
}
