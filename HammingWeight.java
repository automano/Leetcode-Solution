package com.company;

/**
 * Created by Zhening Li on 5/11/2017.
 */
public class HammingWeight {
    public static void main(String[] args){
        HammingWeight solution = new HammingWeight();
        int result = solution.hammingWeight(11);
        System.out.print(result);
    }

    public int hammingWeight(int n) {
        int count = 0;
        while(n!=0) {
            count = count + (n & 1);
            n = n>>>1;
        }
        return count;
    }
}
