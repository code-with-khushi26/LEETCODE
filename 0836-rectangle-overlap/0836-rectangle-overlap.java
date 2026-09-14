class Solution {
    public boolean isRectangleOverlap(int[] rect1, int[] rect2) {
        boolean x=rect1[0]<rect2[2] && rect1[2]>rect2[0];
        boolean y=rect1[1]<rect2[3] && rect1[3]>rect2[1];

        return x && y;
    }
}