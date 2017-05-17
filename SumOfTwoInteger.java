package com.company;

/**
 * Created by Zhening Li on 5/10/2017.
 */
public class SumOfTwoInteger {

    public static void main(String[] args){
        SumOfTwoInteger solution = new SumOfTwoInteger();
        int result = solution.getSum(2,3);
        System.out.print(result);
    }
    public int getSum(int a, int b) {
        if(b == 0)
            return a;
        int sum = a ^ b; //
        int carry = (a & b) << 1;
        return getSum(sum,carry);
    }
}

