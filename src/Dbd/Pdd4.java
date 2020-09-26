package PDD;

import java.util.Scanner;

/**
 *
 4 2

 5
 */
public class Pdd4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[][] dp = new int[x+1][y+1];
        for(int i=0;i<x;i++){
            dp[i][0]=1;
            dp[i][1]=1;
        }
        for(int i=0;i<y;i++){
            dp[0][y]=1;
            dp[1][y]=1;
        }
        for(int i=2;i<=x;i++){
            for(int j=2;j<=y;j++){
                int o = Math.max(Math.max(dp[i-1][j], dp[i][j-1]), dp[i-1][j-1]);
//                int p = Math.max(Math.max(dp[i][j-2]*dp[i-2][2], dp[i-2][j]*dp[2][j-2]), dp[i-2][j-2]*dp[i-2][2]*dp[2][j-2]);
                int p = dp[i-2][j-2]*dp[i-2][2]*dp[2][j-2];
                dp[i][j] = (o+p)%1000000007;
            }
        }
        System.out.println(dp[x][y]);
    }
}
