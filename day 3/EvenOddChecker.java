public class EvenOddChecker {
    public static int checkOdd(int number) {
        if (number % 2 != 0) {
            return 2; 
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int inputNumber = 0; 
        int result = checkOdd(inputNumber);
        System.out.println(result);
    }
}