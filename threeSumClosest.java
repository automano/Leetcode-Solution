package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Zhening Li on 5/14/2017.
 */
public class threeSumClosest {
    public static void  main(String[] args){
        threeSumClosest solution = new threeSumClosest();
        int[] test = {0,2,1,-3};
        int result =  solution.threeSumClosest(test,1);
        System.out.println(result);
    }
    public int threeSumClosest(int[] nums, int target) {
        if(nums == null || nums.length < 3){
            return -1;
        }
        Arrays.sort(nums);
        int cloestSum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length - 2; i++){
            int start = i + 1;
            int end = nums.length - 1;
            while(start < end){
                int sum = nums[i] + nums[start] + nums[end];
                if(Math.abs(target - sum) < Math.abs(target - cloestSum)){
                    cloestSum = sum;
                }
                if(sum  == target){
                    return cloestSum;
                } else if(sum < target){
                    start++;
                } else {
                    end--;
                }
            }
        }
        return cloestSum;
    }
}
