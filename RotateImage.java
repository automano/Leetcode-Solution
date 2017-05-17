/**
 * Created by li.zhening on 5/15/17.
 */
public class RotateImage {
    public static void main(String[] args){
        RotateImage solution = new RotateImage();
        int[][] image = {
                {2,4,5},
                {1,1,1},
                {4,2,3},
        };
        solution.rotate(image);
    }

    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int length = matrix.length;

        for (int i = 0; i < length / 2; i++) {
            for (int j = 0; j < (length + 1) / 2; j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[length - j - 1][i];
                matrix[length -j - 1][i] = matrix[length - i - 1][length - j - 1];
                matrix[length - i - 1][length - j - 1] = matrix[j][length - i - 1];
                matrix[j][length - i - 1] = tmp;
            }
        }
    }
}
