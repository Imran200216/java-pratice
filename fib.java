
import java.util.Scanner;

public class fib {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int firstNum = 0;
        int secondNum = 1;
        int nextNum;

        System.out.println("Enter the Fibonacci Series length: ");
        int fib = input.nextInt();

        for (int i = 0; i < fib; i++) {
            System.out.println(firstNum + "");
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }

    }

}