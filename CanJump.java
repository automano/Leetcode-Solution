package com.company;

/**
 * Created by Zhening Li on 5/16/2017.
 */
public class CanJump {

    public static void main(String[] args){
        CanJump solution = new CanJump();
        int[] test = new int []{3,2,1,0,4};
        boolean result = solution.canJump(test);
        System.out.print(result);
    }

    public boolean canJump(int[] nums){
        int max  = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > max)
                return false;
            max = Math.max(nums[i] + i, max);

        }
        return true;
    }
}
