package ternaryOperator;

public class TernaryOperatorExample {
    public static void main(String[] args) {
        String textCase = "uppercase";

        String firstName = textCase.equals("uppercase") ? "JOHN" : "john";

        System.out.println(firstName);

        int val1 = 10;
        int val2 = 20;

        int max = val1 >= val2 ? val1 : val2;
        System.out.println("max: " + max);

        // nested ternary operator
        String input = "123";
        int value = input == null ? -1 : input.equals("") ? 0 : Integer.parseInt(input);
        System.out.println(value);

    }
}
