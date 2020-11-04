package online.javalearn;

import online.javalearn.exceptions.*;

public class Calculator {

    public static final int EXPRESSION_SIZE = 3;

    public static String calculateString(String input) throws WrongExpressionFormatException, WrongNumberFormatException, WrongNumberSizeException, TypeIncompatibilityException, WrongArithmeticSymbolException {
        String[] strings = input.split("\\s");
        if (strings.length != EXPRESSION_SIZE) {
            throw new WrongExpressionFormatException();
        }
        String firstStringNumber = strings[0];
        String stringAction = strings[1];
        String secondStringNumber = strings[2];

        int num1 = stringNumberToIntNumber(firstStringNumber);
        int num2 = stringNumberToIntNumber(secondStringNumber);

        if (CheckIsThisStringANumber.isArabic(firstStringNumber) && CheckIsThisStringANumber.isArabic(secondStringNumber)) {
            int result = calculate(stringAction, num1, num2);
            return String.valueOf(result);
        } else if (CheckIsThisStringANumber.isRoman(firstStringNumber) && CheckIsThisStringANumber.isRoman(secondStringNumber)) {
            int result = calculate(stringAction, num1, num2);
            return RomanNumeralsConverter.fromIntToRoman(result);
        }else {
            throw new TypeIncompatibilityException();
        }

    }




    private static int stringNumberToIntNumber(String stringNumber) throws WrongNumberFormatException, WrongNumberSizeException {
        int result = 0;
        if (CheckIsThisStringANumber.isArabic(stringNumber)) {
            result = Integer.parseInt(stringNumber);
        } else if (CheckIsThisStringANumber.isRoman(stringNumber)) {
            result = RomanNumeralsConverter.fromRomanToInt(stringNumber);
        } else {
            throw new WrongNumberFormatException();
        }

        if (result >= 1 && result <= 10) {
            return result;
        } else {
            throw new WrongNumberSizeException();
        }

    }


    private static int calculate(String action, int num1, int num2) throws WrongArithmeticSymbolException {
        return switch (action) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new WrongArithmeticSymbolException();
        };

    }


}
