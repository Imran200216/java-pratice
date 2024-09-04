import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // String palindromeWord = input.nextLine();

        String dummyWord = input.nextLine();
        String revWord = "";

        for (int i = dummyWord.length() - 1; i >= 0; i--) {

            revWord = revWord + dummyWord.charAt(i);

        }

        if (dummyWord.equals(revWord)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

    }

}
