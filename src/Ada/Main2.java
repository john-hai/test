package Ada;

import java.util.Scanner;

public class Main2 {
    static int sum = 0;
    public static int largest(int n, int m, int[][] arr, int count){
        int[][] arr1 = new int[n][m];
        int max = 0;
        int maxi = 0;
        int maxj = 0;
        boolean[][] vis = new boolean[n][m];
        for(int i = 0; i < n;i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j] == 1){
                solve(i, j, n, m, vis, arr);
                arr1[i][j] = sum;
                if(sum > max){
                    max = sum;
                    maxi = i;
                    maxj = j;
                }
                sum = 0;
                }else{
                    arr[i][j] = 1;
                    solve(i, j, n, m, vis, arr);
                    arr1[i][j] = sum;
                    if(sum > max){
                        max = sum;
                        maxi = i;
                        maxj = j;
                    }
                    sum = 0;
                    arr[i][j] = 0;
                }
            }
        }
        if(arr[maxi][maxj] == 1){
            return max;
        }
        else{
            if(count > max){
                return max + 1;
            }else {
                return max;
            }
        }
    }

    private static void solve(int x, int y, int rows, int cols, boolean[][] vis, int[][] arr) {
        if(x < 0|| y < 0 || x >= rows || y >= cols || vis[x][y] || arr[x][y] == 0) {
            return;
        }
        vis[x][y] = true;
        sum++;
        solve(x+1,y,rows,cols,vis,arr);
        solve(x,y+1,rows,cols,vis,arr);
        solve(x-1,y,rows,cols,vis,arr);
        solve(x,y-1,rows,cols,vis,arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        //boolean[][] vis = new boolean[n][m];
        int a;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a = sc.nextInt();
                arr[i][j] = a;
                if(a == 1){
                    //vis[i][j] = true;
                    count++;
                }
            }
        }
//        int[][] arr1 = {{1,0,1,1},{1,1,0,1},{0,0,0,0},{1,1,1,1}};
//        int ans = largest(4, 4, arr1, 10);
        int ans = largest(n, m, arr, count);
        System.out.print(ans);
    }
}







