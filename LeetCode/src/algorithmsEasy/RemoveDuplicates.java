package algorithmsEasy;

public class RemoveDuplicates {
	
	public static int removeDuplicate(int[] nums)
	{
		if (nums.length == 0)
		{
			return 0;
		}
		
		int newIndex = 0;
		
		for(int i = 1;i<nums.length;i++)
		{
		if(nums[i] != nums[newIndex])
		{
			newIndex++;
			nums[newIndex]=nums[i];
		}
		}
		return newIndex+1;
		
	}
	
	public static void printArray(int[] nums,int length)
	{
		for (int i = 0;i< length;i++)
		{
			System.out.println(nums[i]+"");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,1,2,2,3,4,4,5};
		
		int newLength = removeDuplicate(nums);
		
		System.out.println("Modified Array:");
		printArray(nums,newLength);
	}

}
