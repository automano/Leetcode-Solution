package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zhening Li on 5/10/2017.
 */
public class RomanNumToInt {
    public static void main(String[] args){
        RomanNumToInt solution = new RomanNumToInt();
        int result = solution.romanToInt_1("MMMCLXXXI");
        System.out.println(result);
    }
    public int romanToInt(String s) {
        if(s.length() == 0 || s.equals(null))
            return 0;
        Map<Character,Integer> romanNumToIntMap = new HashMap<Character,Integer>();
        // create HashMap
        romanNumToIntMap.put('I',1);
        romanNumToIntMap.put('V',5);
        romanNumToIntMap.put('X',10);
        romanNumToIntMap.put('L',50);
        romanNumToIntMap.put('C',100);
        romanNumToIntMap.put('D',500);
        romanNumToIntMap.put('M',1000);

        int sum = romanNumToIntMap.get(s.charAt(s.length()-1)); // set sum as the last roman number
        for(int i = s.length()- 2; i>=0; i--){
            if(romanNumToIntMap.get(s.charAt(i+1)) <= romanNumToIntMap.get(s.charAt(i))) {
                sum += romanNumToIntMap.get(s.charAt(i));
            } else {
                sum -= romanNumToIntMap.get(s.charAt(i));
            }
        }
        return sum;
    }

    public int romanToInt_1(String s) {
        int sum = 0; // store sum
        int lastInteger = 0; // store last corresponding integer
        int curInteger = 0;  // store the current corresponding integer

        //
        int strLength = s.length();
        for(int i = strLength - 1; i>=0; i--){
            char curChar = s.charAt(i);
            switch(curChar){
                case 'M':
                    curInteger = 1000; // get current integer
                    if(curInteger >= lastInteger)
                        sum += curInteger;
                    else
                        sum -= curInteger;
                    lastInteger = 1000; // update last integer by current integer value
                    break;
                case 'D':
                    curInteger = 500;
                    if(curInteger >= lastInteger)
                        sum += curInteger;
                    else
                        sum -= curInteger;
                    lastInteger = 500;
                    break;
                case 'C':
                    curInteger = 100;
                    if(curInteger >= lastInteger)
                        sum += curInteger;
                    else
                        sum -= curInteger;
                    lastInteger = 100;
                    break;
                case 'L':
                    curInteger = 50;
                    if(curInteger >= lastInteger)
                        sum += curInteger;
                    else
                        sum -= curInteger;
                    lastInteger = 50;
                    break;
                case 'X':
                    curInteger = 10;
                    if(curInteger >= lastInteger)
                        sum += curInteger;
                    else
                        sum -= curInteger;
                    lastInteger = 10;
                    break;
                case 'V':
                    curInteger = 5;
                    if(curInteger >= lastInteger)
                        sum += curInteger;
                    else
                        sum -= curInteger;
                    lastInteger = 5;
                    break;
                case 'I':
                    curInteger = 1;
                    if(curInteger >= lastInteger)
                        sum += curInteger;
                    else
                        sum -= curInteger;
                    lastInteger = 1;
                    break;
            }
        }
        return sum;
    }
}
