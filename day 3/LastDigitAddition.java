public class LastDigitAddition {
    public static int addLastDigits(int number1, int number2) {
        int lastDigit1 = Math.abs(number1 % 10); // Get the last digit of number1
        int lastDigit2 = Math.abs(number2 % 10); // Get the last digit of number2
        int sum = lastDigit1 + lastDigit2; // Add the last digits
        return sum;
    }

    public static void main(String[] args) {
        int number1 = 267;
        int number2 = 154;
        int result = addLastDigits(number1, number2);
        System.out.println(result);
    }
}