package online.javalearn;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression to calculate:");
        String input = scanner.nextLine();
        String output = null;
        try {
            output = Calculator.calculateString(input);
        } catch (Exception e) {
            System.out.println(e.toString());
            return;
        }
        System.out.print("Result: ");
        System.out.println(output);
        scanner.close();
    }
}
