public class LastDigit {
    public static int getLastDigit(int number) {
        int lastDigit = Math.abs(number % 10);
        return lastDigit;
    }

    public static void main(String[] args) {
        int inputNumber = 12345; 
        int result = getLastDigit(inputNumber);
        System.out.println(result);
    }
}