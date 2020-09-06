package Dbd;

public class Bili02 {
    public int[] SpiralMatrix (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int up = 1;
        int i = 0;
        int j = 0;
        int[] ans = new int[m*n];
        int index = 0;
        int amout = m*n;
        while(index<amout){
            while(j<n-1){
                ans[index++]=matrix[i][j++];
            }
            n--;
            while(i<m-1){
                ans[index++]=matrix[i++][j];
            }
            m--;
            while(j>left){
                ans[index++]=matrix[i][j--];

            }
            left++;
            while(i>up){
                ans[index++]=matrix[i--][j];
            }
            up++;
        }
        return ans;
    }
}
