package seventyfive_challenge;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        //System.out.println(chars);
        String vowels = "aeiouAEIOU";
        int left = 0, right = chars.length - 1;
        
        while (left < right) {
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }
            
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            
            left++;
            right--;
        }
        
        return new String(chars);
    }

    public static void main(String[] args) {
        String s1 = "hello";
        String result1 = reverseVowels(s1);
        System.out.println(result1);  // Output: "holle"

        String s2 = "leetcode";
        String result2 = reverseVowels(s2);
        System.out.println(result2);  // Output: "leotcede"
    }
}
