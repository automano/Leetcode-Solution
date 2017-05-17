package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Zhening Li on 5/14/2017.
 */
public class fourSum {
    public static void main(String[] args){
        fourSum solution = new fourSum();
        int[] test = {1 ,0 ,-1 ,0 ,-2 ,2};
        List<List<Integer>> result = solution.fourSum(test, 0);
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums == null || nums.length < 4){
            return result;
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 3; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            for(int j = i + 1; j < nums.length - 2; j++){
                if(j > i + 1 && nums[j] == nums[j - 1]){
                    continue;
                }
                int left = j + 1;
                int right = nums.length - 1;
                twoSum(nums,i,j,left,right,target,result);
            }
        }

        return result;
    }

    public void twoSum(int[] nums, int first, int second, int left, int right, int target,  List<List<Integer>> results){
        while(left < right){
            int sum = nums[first] + nums[second] + nums[left] + nums[right];
            if(sum == target){
                List<Integer> tmp = new ArrayList<>();
                tmp.add(nums[first]);
                tmp.add(nums[second]);
                tmp.add(nums[left]);
                tmp.add(nums[right]);
                results.add(tmp);
                left++;
                right--;
                while(left < right && nums[left] == nums[left - 1]){
                    left++;
                }
                while(left < right && nums[right] == nums[right + 1]){
                    right--;
                }
            } else if (sum < target){
                left++;
            } else {
                right--;
            }
        }
    }
}
