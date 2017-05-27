package com.company;

/**
 * Created by Zhening Li on 5/26/2017.
 */
public class ProductExceptSelf {
    public static void main(String[] args){
        ProductExceptSelf solution = new ProductExceptSelf();
        int[] test = {2,3,4,5};
        int[] result = solution.productExceptSelf(test);
    }

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for(int i = 1; i < nums.length; i++){
            result[i] = result[i - 1] * nums[i - 1];
        }
        int right = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }
}
