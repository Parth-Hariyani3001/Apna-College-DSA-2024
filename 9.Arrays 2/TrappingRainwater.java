
public class TrappingRainwater {

    public static void main(String args[]) {
        int trappedWater = 0;
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];

        leftMax[0] = height[0];
        rightMax[height.length - 1] = height[height.length - 1];

        for (int i = 1; i < leftMax.length; i++) {
            int currHeight = height[i];
            leftMax[i] = Math.max(currHeight, leftMax[i - 1]);
        }

        for (int i = height.length - 2; i >= 0; i--) {
            int currHeight = height[i];
            rightMax[i] = Math.max(currHeight, rightMax[i + 1]);
        }

        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            trappedWater += waterLevel - height[i];
        }
        System.out.print("Total Trapped water : " + trappedWater);
    }
}
