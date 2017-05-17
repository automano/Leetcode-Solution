package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Zhening Li on 5/14/2017.
 */
public class threeSum {
    public static void main(String[] args){
        threeSum solution = new threeSum();
        int[] test = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = solution.threeSum(test);
    }
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if(nums == null || nums.length < 3){
            return results;
        }

        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            // skip the duplicate triples
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];
            twoSum(nums, left, right, target, results);
        }

        return results;
    }

    public void twoSum(int[] nums, int left, int right, int target,  List<List<Integer>> results){
        while(left < right){
            if(nums[left] + nums[right] == target){
                List<Integer> triple = new ArrayList<>();
                triple.add(-target);
                triple.add(nums[left]);
                triple.add(nums[right]);
                results.add(triple);
                left++;
                right--;
                while(left < right && nums[left] == nums[left - 1]){
                    left++;
                }
                while(left < right && nums[right] == nums[right + 1]){
                    right--;
                }
            } else if (nums[left] + nums[right] < target){
                left++;
            } else {
                right--;
            }
        }
    }
}
