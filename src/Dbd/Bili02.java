package Dbd;

public class Bili02 {
    public int[] SpiralMatrix (int[][] matrix) {
        // write code here
        int m = matrix.length;
        int n = matrix[0].length;
        int boderLeft = 0;
        int boderUp = 1;
        int i = 0;
        int j = 0;
        int[] ans = new int[m*n];
        int index = 0;
        int amout = m*n;
        while(index<amout){
            //right
            while(j<n-1){
                ans[index++]=matrix[i][j++];
            }
            n--;
            //down
            while(i<m-1){
                ans[index++]=matrix[i++][j];
            }
            m--;
            //left
            while(j>boderLeft){
                ans[index++]=matrix[i][j--];

            }
            boderLeft++;
            //up
            while(i>boderUp){
                ans[index++]=matrix[i--][j];
            }
            boderUp++;
        }
        return ans;
    }
}
