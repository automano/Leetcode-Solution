package com.company;

/**
 * Created by Zhening Li on 5/27/2017.
 */
public class FindMin {
    public static void main(String[] args){
        FindMin solution = new FindMin();
        int[] test = {4,5,6,7,0,1,2};
        int result = solution.findMin(test);
    }
    public int findMin(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }

        if(nums.length == 1){
            return nums[0];
        }

        int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = (start + end) / 2;
            if(mid > 0 && nums[mid] < nums[mid - 1]){
                return nums[mid];
            }
            if(nums[start] <= nums[mid] && nums[mid] > nums[end]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[start];
    }
}
