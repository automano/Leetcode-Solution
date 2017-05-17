package com.company;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

/**
 * Created by Zhening Li on 5/12/2017.
 */
public class BinaryWatch {
    public static void main(String[] args){
        BinaryWatch solution = new BinaryWatch();
        List<String> result = solution.readBinaryWatch(1);
        for(String i: result){
            System.out.print(i);
            System.out.print(" ");
        }
    }

    public List<String> readBinaryWatch(int num) {
        List<String> myList = new ArrayList<String>();
        if(num < 0 || num > 10) return myList;
        for (int h = 0; h < 12; ++h) {
            for (int m = 0; m < 60; ++m) {
                if ((Integer.bitCount((h << 6) + m) == num)){
                    StringBuilder sb = new StringBuilder();
                    sb.append("");
                    sb.append(h);
                    if(m < 10){
                        sb.append(":0" + m);
                    } else {
                        sb.append(":" + m);
                    }
                    String strI = sb.toString();
                    myList.add(strI);
                }
            }
        }
        return myList;
    }
}