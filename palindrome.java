import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Palindrome {
    private static void isPalindrome(String string) {
        int string_len = string.length();
        int j = string_len - 1;

        for (int i = 0; i < string_len; i++) {
            if (string.charAt(i) != string.charAt(j)) {
                System.out.println("String is not palindrome");
                return;
            }
            j -= 1;
        }

        System.out.println("String is palindrome");
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter String: ");
            String string = reader.readLine();

            isPalindrome(string);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }
}