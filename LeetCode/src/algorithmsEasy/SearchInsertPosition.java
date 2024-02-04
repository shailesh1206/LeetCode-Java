package algorithmsEasy;

public class SearchInsertPosition {

	 public int searchInsert(int[] nums, int target) {
		 for(int i =0;i<nums.length;i++)
		 {
			 if(nums[i]==target)
			 {
				 return i;
			 }else if(nums[i]> target)
			 {
				 return i;
			 }else
			 {
				 continue;
			 }
		 }
		return nums.length;
		
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s[] = {1,2,7,8,9};
		int target =12 ;
		
		SearchInsertPosition m = new SearchInsertPosition();
		int q  = m.searchInsert(s, target);
		System.out.println(q);
	}

}
