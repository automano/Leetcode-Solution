package com.company;

/**
 * Created by Zhening Li on 5/28/2017.
 */
public class TwoSumSorted {
    public static void main(String[] args){
        TwoSumSorted solution = new TwoSumSorted();
        int[] test = {2,3,4};
        int[] result = solution.twoSum(test,6);
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if(numbers == null || numbers.length < 2){
            return result;
        }
        for(int i = 0; i < numbers.length - 1; i++){
            int start = i + 1;
            int end = numbers.length - 1;
            int gap = target - numbers[i];
            while(start <= end){
                int mid = start + (end - start) / 2;
                if(numbers[mid] == gap){
                    result[0] = i + 1;
                    result[1] = mid + 1;
                    break;
                } else if (numbers[mid] > gap){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return result;
    }
}
