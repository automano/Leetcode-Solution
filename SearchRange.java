package com.company;

/**
 * Created by Zhening Li on 5/15/2017.
 */
public class SearchRange {
    public static void main(String[] args){
        SearchRange solution = new SearchRange();
        int [] test = new int[]{5,7,7,8,8,10};
        int[] result = solution.searchRange(test,8);

    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};

        if(nums == null || nums.length == 0){
            return res;
        }

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target)
                left = mid + 1;
            else
                right = mid;
        }

        if (nums[right] != target)
            return res;
        res[0] = right;
        right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target)
                left = mid + 1;
            else
                right= mid;
        }
        res[1] = left - 1;
        return res;

    }
}
