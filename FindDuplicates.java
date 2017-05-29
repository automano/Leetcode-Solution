package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhening Li on 5/28/2017.
 */
public class FindDuplicates {
    public static void main(String[] args){
        FindDuplicates solution = new FindDuplicates();
        int[] test = {4,3,2,7,8,2,3,1};
        List<Integer> result = solution.findDuplicates(test);
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i< nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0)
                result.add(Math.abs(index + 1));
            nums[index] = -nums[index];
        }
        return result;
    }
}
