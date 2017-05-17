package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhening Li on 5/16/2017.
 */
public class SpiralMatrix {

    public static void main(String[] args){
        SpiralMatrix solution = new SpiralMatrix();
        int[][] test = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> result = new ArrayList<Integer>();
        result = solution.spiralOrder(test);
        for(Integer i:result){
            System.out.print(i + " ");
        }
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0)
            return result;

        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;
        while(count * 2 < rows && count * 2 < cols){
            for(int i = count; i < cols - count; i++)
                result.add(matrix[count][i]);

            for(int i = count + 1; i < rows - count; i++)
                result.add(matrix[i][cols - count -1]);

            if(rows - 2 * count == 1 || cols - 2 * count == 1)
                break;

            for(int i = cols - count - 2; i >= count; i--)
                result.add(matrix[rows - count - 1][i]);

            for(int i = rows - count -2; i >= count + 1; i--)
                result.add(matrix[i][count]);

            count++;
        }
        return result;
    }
}
