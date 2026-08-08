class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                swap(matrix[i],j,matrix[j],i);
            }
        }

        for(int i=0;i<n;i++){
            int l=0;
            int r=n-1;
            while(l<r){
                int temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;

                l++;
                r--;
            }
        }

    }
    public static void swap(int[] arr1,int i,int[] arr2,int j) {
    int temp = arr1[i];
    arr1[i] = arr2[j];
    arr2[j] = temp;

}
}