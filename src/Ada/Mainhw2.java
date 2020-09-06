package Ada;

import java.util.Scanner;

public class Mainhw2 {
    public static int numberOfLake(int m, int n, char[][] array){
        int sum = 0;
        boolean[][] vis = new boolean[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(array[i][j] == 'S'){
                    solve(i, j, m, n, array);
                    sum++;
                }
            }
        }
        return sum;
    }
    private static void solve(int x, int y, int rows, int cols, char[][] array) {
        if(x < 0|| y < 0 || x >= rows || y >= cols || array[x][y] == 'H') {
            return;
        }
        array[x][y] = 'H';
        // vis[x][y] = true;
        solve(x+1,y,rows,cols,array);
        solve(x,y+1,rows,cols,array);
        solve(x-1,y,rows,cols,array);
        solve(x,y-1,rows,cols,array);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mn = sc.nextLine();
        int s = -1;
        for(int k = 0; k < mn.length(); k++){
            if(mn.charAt(k)==','){
                s = k;
            }
        }
        int m = Integer.parseInt(mn.substring(0, s));
        int n = Integer.parseInt(mn.substring(s+1));
        String[] strings = new String[m];
        char[][] array = new char[m][n];
        for(int i = 0;i < m; i++){
            strings[i] = sc.nextLine();
            for(int j = 0; j < n; j++){
                array[i][j] = strings[i].charAt(j);
            }
        }
        int ans = numberOfLake(m, n, array);
        System.out.print(ans);
    }
}


