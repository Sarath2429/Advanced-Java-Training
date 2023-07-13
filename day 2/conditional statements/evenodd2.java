import java.util.Scanner;
class evenodd2 {

    public static void main(String[] args) {
        
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();
        
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        
        sc.close();
        sum = num1 + num2;
        if(sum%2==0){
            System.out.println("The sum is even");
        }
        else{
            System.out.println("The sum is odd");
        }
    }
}
