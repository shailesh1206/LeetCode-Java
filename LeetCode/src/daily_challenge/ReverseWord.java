package daily_challenge;

public class ReverseWord {

    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverseWords(input);
        System.out.println(reversed); // Output: olleH dlroW
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String reversedWord = reverseString(word);
            result.append(reversedWord).append(" ");
        }

        // Remove the trailing space and return the result
        return result.toString().trim();
    }

    public static String reverseString(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
}
