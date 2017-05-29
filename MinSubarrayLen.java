package com.company;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * Created by Zhening Li on 5/28/2017.
 */
public class MinSubarrayLen {
    public static void main(String[] args){
        MinSubarrayLen solution = new MinSubarrayLen();
        int[] test = {2,3,1,2,4,3};
        int result = solution.minSubArrayLen(7,test);
    }

    public int minSubArrayLen(int s, int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;

        while(j < nums.length){
            sum += nums[j++];

            while(sum >= s){
                min = Math.min(min, j - i);
                sum -= nums[i++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
