package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zhening Li on 5/28/2017.
 */
public class CombinationSumIII {
    public static void main(String[] args){
        CombinationSumIII solution = new CombinationSumIII();
        List<List<Integer>> result = solution.combinationSum3(3,7);
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList();
        combination(result, new ArrayList<Integer>(), k, 1, n);
        return result;
    }

    private void combination(List<List<Integer>> result, List<Integer> comb, int k, int start, int n){
        if (comb.size() > k) {
            return;
        }
        if(comb.size() == k && n == 0){
            List<Integer> li = new ArrayList<Integer>(comb);
            result.add(li);
            return;
        }
        for(int i = start; i <= 9; i++){
            comb.add(i);
            combination(result,comb,k,i+1,n-i);
            comb.remove(comb.size() - 1);
        }
    }
}
