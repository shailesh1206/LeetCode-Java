package algorithmsEasy;
import java.util.HashMap;

public class RomanToInteger {

	public static int romanToInt(String s)
	{
		if(s == null || s.length()==0) {
			return 0;
		}
		
		HashMap<Character,Integer> romanToIntMap = new HashMap<>();
		romanToIntMap.put('I',1);
		romanToIntMap.put('V',5);
		romanToIntMap.put('X',10);
		romanToIntMap.put('L',50);
		romanToIntMap.put('C',100);
		romanToIntMap.put('D',500);
		romanToIntMap.put('M',1000);
		
		int result = romanToIntMap.get(s.charAt(s.length()-1));
		
		
		for(int i=s.length()-2;i>=0;i--)
		{
			
		 if (romanToIntMap.get(s.charAt(i))<romanToIntMap.get(s.charAt(i+1)))
		 {
			 result -= romanToIntMap.get(s.charAt(i));
			
         } else
		 {
             result += romanToIntMap.get(s.charAt(i));
            
         }
     
		
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String romanNumeral = "MDMIX";
        int result = romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is: " + result);
    }

}
