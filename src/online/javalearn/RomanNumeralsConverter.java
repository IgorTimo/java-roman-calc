package online.javalearn;

import java.util.List;

public class RomanNumeralsConverter {

    private  static List<RomanNumerals> romanNumeralsList = RomanNumerals.getReverseSortedValues();

    public static int fromRomanToInt(String number) {
        int result = 0;

        int i = 0;

        while ((number.length() > 0) && (i < romanNumeralsList.size())) {
            RomanNumerals symbol = romanNumeralsList.get(i);
            if (number.startsWith(symbol.name())) {
                result += symbol.getValue();
                number = number.substring(symbol.name().length());
            }else {
                i++;
            }
        }

        return result;
    }

    public static String fromIntToRoman(int number) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while ((number > 0) && (i < romanNumeralsList.size())) {
            RomanNumerals currentSymbol = romanNumeralsList.get(i);
            if (currentSymbol.getValue() <= number) {
                stringBuilder.append(currentSymbol.name());
                number -=currentSymbol.getValue();
            }else {
                i++;
            }
        }

        return stringBuilder.toString();
    }
}
