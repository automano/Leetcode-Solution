package com.company;

/**
 * Created by Zhening Li on 5/27/2017.
 */
public class MaxProduct {
    public static void main(String[] args){
        MaxProduct solution = new MaxProduct();
        int[] test = {-2, 2, 3, -1, 4};
        int result = solution.maxProduct(test);
    }

    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for(int i = 1; i < nums.length; i++){
            int tmp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(tmp * nums[i], min * nums[i]), nums[i]);
            if(max > result){
                result = max;
            }
        }
        return result;
    }
}
