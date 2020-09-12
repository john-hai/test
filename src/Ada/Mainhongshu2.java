package Ada;

public class Mainhongshu2 {
    static int solution(String s){
        int len = s.length();
        int[] f = new int[len + 1];
        int[][] dp = new int[len][len];
        for(int i = 0; i <= len; i++){
            f[i] = len -1 - i;
        }
        for(int i = len -1; i >= 0; i--){
            dp[i][i] = 1;
            for(int j= i; j < len;j++){
                if(s.charAt(i) == s.charAt(j) && ((j - i < 2) || dp[i + 1][j - 1] == 1)){
                    dp[i][j] = 1;
                    f[i] = Math.min(f[i], f[j+1]+1);
                }
            }
        }
        return f[0] + 1;
    }
}
