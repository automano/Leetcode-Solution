/**
 * Created by li.zhening on 5/15/17.
 */
public class JumpGameII {
    public static void main(String[] args){
        JumpGameII solution = new JumpGameII();
        int[] test = new int[]{2,3,1,1,4};
        int result = solution.jump(test);
        System.out.println(result);
    }

    public int jump(int nums[]) {
        int ret = 0;
        int last = 0;
        int curr = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (i > last) {
                last = curr;
                ++ret;
            }
            curr = Math.max(curr, i+nums[i]);
        }

        return ret;
    }
}
