package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Zhening Li on 5/17/2017.
 */
public class Subsets {
    public static void main(String[] args){
        Subsets solution = new Subsets();
        int[] test = new int[]{1,2,3};
        solution.subsets(test);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if(nums == null){
            return results;
        }

        if (nums.length == 0) {
            results.add(new ArrayList<Integer>());
            return results;
        }

        Arrays.sort(nums);
        helper(new ArrayList<Integer>(), nums, 0, results);
        return results;
    }

    private void helper(List<Integer> subset,
                        int[] nums,
                        int startIndex,
                        List<List<Integer>> results) {

        results.add(new ArrayList<Integer>(subset));

        for (int i = startIndex; i < nums.length; i++) {
            subset.add(nums[i]);
            helper(subset, nums, i + 1, results);
            subset.remove(subset.size() - 1);
        }
    }
}
