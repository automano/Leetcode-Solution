package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhening Li on 5/29/2017.
 */
public class MissingRanges {
    public static void main(String[] args){
        MissingRanges solution = new MissingRanges();
        int[] test = {0, 1, 3, 50, 75};
        List<String> result = solution.findMissingRanges(test, 0,99);
    }

    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> ranges = new ArrayList<>();
        int prev = lower - 1;
        for(int i = 0; i<= nums.length; i++){
            int cur = (i == nums.length)? upper + 1: nums[i];
            if(cur - prev >= 2){
                ranges.add(getRange(prev + 1, cur - 1));
            }
            prev = cur;
        }
        return ranges;
    }

    public String getRange(int from, int to){
        return (from == to) ? String.valueOf(from) : from + "->" + to;
    }
}
