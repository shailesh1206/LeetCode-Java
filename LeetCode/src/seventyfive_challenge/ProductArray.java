package seventyfive_challenge;

public class ProductArray {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            output[i] = leftProduct;
            leftProduct *= nums[i];
 
        }
        
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
        	System.out.println("Output "+i+" "+output[i]);
            output[i] *= rightProduct;
            
            System.out.println("rightProduct "+rightProduct);
            rightProduct *= nums[i];
            System.out.println("******************");
            System.out.println("Nums "+i+" "+nums[i]);
            System.out.println("rightProduct "+rightProduct);
        }
        return output;
    }

    public static void main(String[] args) {
        ProductArray solution = new ProductArray();
        int[] nums = {1, 2, 3, 4};
        int[] result = solution.productExceptSelf(nums);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
