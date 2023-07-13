public class SecondLastDigit {
    public static int getSecondLastDigit(int number) {
        int secondLastDigit = Math.abs((number / 10) % 10); 
        return secondLastDigit;
    }

    public static void main(String[] args) {
        int inputNumber = 1234;
        int result = getSecondLastDigit(inputNumber);
        System.out.println(result);
    }
}