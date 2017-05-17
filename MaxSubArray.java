/**
 * Created by li.zhening on 5/15/17.
 */
public class MaxSubArray {

    public static void main(String[] args){
        MaxSubArray solution = new MaxSubArray();
        int[] test = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int result = solution.maxSubArray(test);
        System.out.println(result);
    }

    public int maxSubArray(int[] nums) {
        int maxSoFar=nums[0], maxEndingHere=nums[0];
        for (int i=1;i<nums.length;++i){
            maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}
