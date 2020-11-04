package online.javalearn;

public class CheckIsThisStringANumber {

    public static boolean isArabic(String number){
        boolean isArabic = true;
        char ch;
        for (int i = 0; i < number.length(); i++) {
            ch = number.charAt(i);
            if (ch > 57 || ch < 49) {
                isArabic = false;
            }
        }
        return isArabic;
    }


    public static boolean isRoman(String number) {
        boolean isRoman = true;
        char ch;
        for (int i = 0; i < number.length(); i++) {
            ch = number.charAt(i);
            if (ch != 73 && ch !=86 && ch != 88) {
                isRoman = false;
            }
        }
        return isRoman;
    }





}
