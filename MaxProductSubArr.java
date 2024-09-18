class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int p = 1;
            for(int j = i; j< nums.length; j++){
                p*=nums[j];
                max = Math.max(p,max);
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] nums = {4,0,10,0,-3};
        System.out.println(maxProduct(nums));
    }
    public int maxProduct(int[] nums) {
        int leftProduct = 1;
        int rightProduct = 1;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            // Calculate product from left
            leftProduct = (leftProduct == 0) ? nums[i] : leftProduct * nums[i];
            max = Math.max(max, leftProduct);

            // Calculate product from right
            rightProduct = (rightProduct == 0) ? nums[nums.length - i - 1] : rightProduct * nums[nums.length - i - 1];
            max = Math.max(max, rightProduct);
        }

        return max;
    }
    public int maxProduct(int[] nums) {
        int currMax = nums[0];  
        int currMin = nums[0];  
        int maxProduct = nums[0]; 

        for(int i = 1; i < nums.length; i++) {
            // If the current number is negative, swap currMax and currMin
            if (nums[i] < 0) {
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }
            currMax = Math.max(nums[i], currMax * nums[i]);
            currMin = Math.min(nums[i], currMin * nums[i]);
            maxProduct = Math.max(maxProduct, currMax);
        }

        return maxProduct;
    }
}