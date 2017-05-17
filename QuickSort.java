package com.company;

/**
 * Created by Zhening Li on 5/11/2017.
 */
public class QuickSort {
    public static void main(String[] args){
        int[] inputNums = {9,8,7,6,5,4,3,2,1};
        QuickSort solution = new QuickSort();
        solution.quickSort(inputNums,0,inputNums.length - 1);
        for(Integer i: inputNums) {
            System.out.print(i);
            System.out.print(" ");
        }
    }
    public void quickSort(int[] nums, int lowIndex, int highIndex){
        if(lowIndex > highIndex) return;
        int i = lowIndex;
        int j = highIndex;
        int pivot = nums[lowIndex + (highIndex - lowIndex) / 2]; // pivot element
        while (i <= j){
            while (nums[i] < pivot){
                i++;
            }
            while (nums[j] > pivot){
                j--;
            }
            if (i <= j) {
                swap(nums, i, j);
                i++;
                j--;
            }
        }
        if(i < highIndex)
            quickSort(nums, i, highIndex);
        if(j > lowIndex)
            quickSort(nums, lowIndex, j);
    }

    public void swap(int[] nums, int a, int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] =tmp;
    }
}
