public class Even_OddChecker {
    public static int checkEven(int number) {
        if (number % 2 == 0) {
            return 2; // Even number
        } else {
            return 1; // Odd number
        }
    }

    public static void main(String[] args) {
        int inputNumber = 0; // Assuming the input number is provided by the user
        int result = checkEven(inputNumber);
        System.out.println(result);
    }
}