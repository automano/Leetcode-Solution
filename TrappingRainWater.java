/**
 * Created by li.zhening on 5/15/17.
 */
public class TrappingRainWater {

    public static void main(String[] args){
        TrappingRainWater solution = new TrappingRainWater();
        int[] test = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int result = solution.trap(test);
        System.out.println(result);
    }

    public int trap(int[] heights) {
        if(heights == null || heights.length == 0)
            return 0;
        int left = 0, right = heights.length - 1;
        int res = 0;
        if(left >= right)
            return res;
        int leftheight = heights[left];
        int rightheight = heights[right];
        while(left < right) {
            if(leftheight < rightheight) {
                left ++;
                if(leftheight > heights[left]) {
                    res += (leftheight - heights[left]);
                } else {
                    leftheight = heights[left];
                }
            } else {
                right --;
                if(rightheight > heights[right]) {
                    res += (rightheight - heights[right]);
                } else {
                    rightheight = heights[right];
                }
            }
        }
        return res;
    }
}
