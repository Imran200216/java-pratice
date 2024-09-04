
import java.util.Scanner;

class prime_number {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int primeNum = input.nextInt();

        int count = 0;

        for (int i = 1; i <= primeNum; i++) {

            if (primeNum % i == 0) {
                count++;
            }

        }

        if (count == 2) {
            System.out.println("it is prime number");
        } else {
            System.out.println("it is not a prime number");
        }

    }

}