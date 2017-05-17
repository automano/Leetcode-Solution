/**
 * Created by li.zhening on 5/15/17.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;



public class CombinationSum {

    public  static void main(String[] args){
        CombinationSum solution = new CombinationSum();
        int[] test = new int[]{2,3,5,7};
        List<List<Integer>> result = new ArrayList<List<Integer>> ();
        result = solution.combinationSum(test,7);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>> ();
        if(candidates == null || candidates.length == 0) {
            return result;
        }

        ArrayList<Integer> curSum = new ArrayList<Integer> ();
        Arrays.sort(candidates);

        combinationSum(candidates, target, 0, curSum, result);

        return result;
    }

    public void combinationSum(int[] candidates, int target, int j, List<Integer> curSum, List<List<Integer>> result){
        if(target == 0){
            List<Integer> tmp = new ArrayList<Integer>(curSum);
            result.add(tmp);
            return;
        }

        for(int i=j; i<candidates.length; i++){
            if(target < candidates[i])
                return;

            curSum.add(candidates[i]);
            combinationSum(candidates, target - candidates[i], i, curSum, result);
            curSum.remove(curSum.size()-1);
        }
    }

}
