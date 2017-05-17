package com.company;

/**
 * Created by Zhening Li on 5/17/2017.
 */
public class UniquePathII {
    public static void main(String[] args) {
        UniquePathII solution = new UniquePathII();
        int[][] test = new int[3][3];
        test[1][1] = 1;
        int result = solution.uniquePathsWithObstacles(test);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        obstacleGrid[0][0]^=1;
        for(int i = 1;i<m;i++){
            obstacleGrid[i][0] = (obstacleGrid[i][0] == 1)? 0:obstacleGrid[i-1][0];
        }

        for(int j = 1;j<n;j++){
            obstacleGrid[0][j] = (obstacleGrid[0][j] == 1)? 0: obstacleGrid[0][j-1];
        }
        for(int i = 1;i<m;i++){
            for(int j =1;j<n;j++){
                obstacleGrid[i][j] = (obstacleGrid[i][j] == 1)? 0: obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
            }
        }
        return obstacleGrid[m-1][n-1];
    }
}
