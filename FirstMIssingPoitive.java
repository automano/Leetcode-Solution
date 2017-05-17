/**
 * Created by li.zhening on 5/15/17.
 */
public class FirstMIssingPoitive {

    public static void  main(String[] args){
        FirstMIssingPoitive solution = new FirstMIssingPoitive();
        int[] test = new int[]{-2,-1,3,4};
        int result = solution.firstMissingPositive(test);
        System.out.println(result);
    }


    public int firstMissingPositive(int[] A) {
        if (A == null) {
            return 1;
        }

        for (int i = 0; i < A.length; i++) {
            while (A[i] > 0 && A[i] <= A.length && A[i] != (i+1)) {
                int tmp = A[A[i]-1];
                if (tmp == A[i]) {
                    break;
                }
                A[A[i]-1] = A[i];
                A[i] = tmp;
            }
        }

        for (int i = 0; i < A.length; i ++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }

        return A.length + 1;
    }
}
