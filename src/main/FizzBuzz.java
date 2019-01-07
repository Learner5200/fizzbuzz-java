package main;

public class FizzBuzz {
    public static String message(int number) {
        String message = "";
        if (number % 3 == 0) {
            message += "fizz";
        }
        if (number % 5 == 0) {
            message += "buzz";
        }
        if (message == "") {
            message = Integer.toString(number);
        }
        return message;
    }
}
