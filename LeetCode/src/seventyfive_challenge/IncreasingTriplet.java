package seventyfive_challenge;

public class IncreasingTriplet {

	public boolean increasingTriplet(int[] nums)
	{
		if (nums.length < 3) {
            return false;
        }
		 int min1 = Integer.MAX_VALUE;
	     int min2 = Integer.MAX_VALUE;
		
	     for (int num : nums) {
	            if (num <= min1) {
	                min1 = num; 
	            } else if (num <= min2) {
	                min2 = num;
	            } else {
	                return true;
	            }
	        }

	        return false;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = {20,100,10,12,5,13};//{1,2,3,4,5,6}
		IncreasingTriplet tri = new IncreasingTriplet();
		boolean n = tri.increasingTriplet(s);
		System.out.println(n);
		
	}

}
