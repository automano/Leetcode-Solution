package com.company;

/**
 * Created by Zhening Li on 5/12/2017.
 */
public class IntegerToRoman {
    public static void main(String[] args){
        IntegerToRoman solution = new IntegerToRoman();
        String result = solution.intToRoman(3255);
        System.out.println(result);
    }

    public String intToRoman(int num) {
        if(num <= 0) return "";
        String[] romanNum = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] intNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuffer resultBuffer = new StringBuffer();
        for(int i = 0; i < intNum.length; i++){
            while(num >= intNum[i]){
                num -= intNum[i];
                resultBuffer.append(romanNum[i]);
            }
        }
        String result = resultBuffer.toString();
        return result;
    }
}
