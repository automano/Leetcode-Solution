package com.company;

/**
 * Created by Zhening Li on 5/16/2017.
 */
public class SpiralMatrixII {
    public static void main(String[] args){
        SpiralMatrixII solution = new SpiralMatrixII();
        int[][] result = solution.generateMatrix(4);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    public int[][] generateMatrix(int n) {
            int [][] result = new int[n][n];
            if(n < 0){
                return null;
            }

            int nlvl = n / 2;
            int val = 1;
            for(int i = 0; i < nlvl; i++){
                int last = n - 1 - i;
                for(int j = i; j < last; j++){
                    result[i][j] = val++;
                }
                for(int j = i; j < last; j++){
                    result[j][last] = val++;
                }
                for(int j = last; j > i; j--){
                    result[last][j] = val++;
                }
                for(int j = last; j > i; j--){
                    result[j][i] = val++;
                }
            }
            if(n%2==1) result[n/2][n/2] = val;
            return result;
        }

}
