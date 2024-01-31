package algorithmsEasy;

public class RemoveElement {

	public static void main(String[] args) {
	    int[] nums = {3, 2, 2, 3, 4, 5, 3};
	    int val = 3;
	    
	    RemoveElement remover = new RemoveElement();
	    int newLength = remover.removeElement(nums, val);

	    // Print the modified array
	    for (int i = 0; i < newLength; i++) {
	        System.out.print(nums[i] + " ");
	    }
	}

    // Function to remove an element from an array
    private static int removeElement(int[] nums, int val) {
        int length = nums.length;
        int i = 0;
        
        for(int j = 0;j<length;j++)
        {
        	if(nums[j] != val)
        	{
        		nums[i] = nums[j];
        		i++;
        	}
        }
        return i;
    }
}
