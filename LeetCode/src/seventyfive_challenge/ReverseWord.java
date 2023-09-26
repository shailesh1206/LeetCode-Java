package seventyfive_challenge;

public class ReverseWord {

	    public static String reverseWords(String s) {
	    	//This line first trims any leading or trailing spaces from the input string s. 
	    	//Then, it uses split("\\s+") to split the string into an array of words based on one or more whitespace characters.
	    	
	        String[] words = s.trim().split("\\s+");
	        StringBuilder reversed = new StringBuilder();
	        
	        // This loop iterates through the words array in reverse order.
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversed.append(words[i]).append(" ");
	        }

	        return reversed.toString().trim();
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello World";
		String result = reverseWords(s);
		System.out.println(result);
		

}
	}
