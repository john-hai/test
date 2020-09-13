package meituan;

import java.util.Scanner;

/**
 *
 8 3
 1 0 1
 0 1 0
 0 1 0
 1 0 1
 1 0 1
 0 1 0
 0 1 0
 1 0 1

 1 0 1
 0 1 0
 */
public class MT01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] memo = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                memo[i][j] = scanner.nextInt();
            }
        }
        int ans = m;
        int up = 0;
        int down = m-1;
        while(identify(memo,up,down)){
            ans/=2;
            down/=2;
        }
        for(int i=0;i<ans;i++){
            for(int j=0;j<n;j++){
                System.out.print(memo[i][j]);
                if(j<n-1) System.out.print(" ");
            }
            if(i<ans-1) System.out.println();
        }
    }

    public static boolean identify(int[][] memo, int up, int down){
        int mid = (up+down)/2;
        for(int i=0;i<=mid;i++){
            for(int j=0;j<memo[0].length;j++){
                if(memo[i][j]!=memo[up+down-i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
