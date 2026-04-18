public class Solution {
    public static int robDP(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[][] dp = new int[2][nums.length + 2];

        for (int i = nums.length - 1; i >= 0; i--) {
            dp[0][i] = (i == nums.length - 1) ? 0 : Math.max(nums[i] + dp[0][i + 2], dp[0][i + 1]);
            dp[1][i] = (i == 0) ? dp[1][i + 1] : Math.max(nums[i] + dp[1][i + 2], dp[1][i + 1]);
        }

        return Math.max(dp[0][0], dp[1][0]);
    }

    public static int robSlow(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        return Math.max(
                helper(nums, 0, true),
                helper(nums, 1, false)
        );
    }

    private static int helper(int[] nums, int i, boolean robFirst) {
        if (i >= nums.length) return 0;
        if (i == nums.length - 1 && robFirst) return 0;

        int robCurrentHouse = nums[i] + helper(nums, i + 2, robFirst);
        int skipCurrentHouse = helper(nums, i + 1, robFirst);
        return Math.max(robCurrentHouse, skipCurrentHouse);
    }
}
