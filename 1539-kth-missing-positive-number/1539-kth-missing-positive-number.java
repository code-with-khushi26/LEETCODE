class Solution {
    public int findKthPositive(int[] arr, int k) {
         int current = 1;
        int i = 0;

        while (true) {
            if (i < arr.length && arr[i] == current) {
                i++;
            } else {
                k--;
                if (k == 0) {
                    return current;
                }
            }
            current++;

        }
    }
}