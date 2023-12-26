import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String initialWord = reader.readLine();
        String palindrome = getPalindrome(initialWord);
        System.out.println("Palindrome from the word " + initialWord + " is :" + palindrome);
    }

    private static String getPalindrome(String initialWord) {
        StringBuilder secondWordString = new StringBuilder();
        for (int i = initialWord.length() - 1; i >= 0; i--) {
            Character character = initialWord.charAt(i);
            secondWordString.append(character);
        }
        return initialWord.concat(secondWordString.toString());
    }
}
