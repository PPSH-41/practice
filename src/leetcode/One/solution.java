package leetcode.One;

public class solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        int i;
        int j;
        for (i = 0; i < nums.length; i++) {
            for (j = 0; j != i & j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    //System.out.print("["nums[i] + "," + nums[j]"]");
                    index[0]=i;
                    index[1]=j;
                    return index;
                }
            }
        }
        return index;
    }
}
