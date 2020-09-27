import java.util.Scanner;
public class Netease1 {
    public static int[][] solution(int n){
        int[][] ans = new int[n][n];
        if(n == 0){
            return ans;
        }
        int k = 1;
        int x = n;
        int y = n;
        int left = 0, right = columns - 1, top = 0, bottom = x - 1;
        while(left <= right && top <= bottom){
            if(left % 2 == 0 && top % 2 == 0) {
                for (int column = left; column <= right; column++) {
                    ans[top][column] = k++;
                }
                for (int row = top + 1; row <= bottom; row++) {
                    ans[row][right] = k++;
                }
                if (left < right && top < bottom) {
                    for (int column = right - 1; column > left; column--) {
                        ans[bottom][column] = k++;
                    }
                    for (int row = bottom; row > top; row--) {
                        ans[row][left] = k++;
                    }
                }
            }
            else if(left % 2 == 1 && top % 2 == 1) {
                for (int row = top; row <= bottom; row++) {
                    ans[row][left] = k++;
                }
                for (int column = left + 1; column <= right; column++) {
                    ans[bottom][column] = k++;
                }

                if (left < right && top < bottom) {
                    for (int row = bottom - 1; row > top; row--) {
                        ans[row][right] = k++;
                    }
                    for (int column = right; column > left; column--) {
                        ans[top][column] = k++;
                    }
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 0; i < num; i++){
            int N = scanner.nextInt();
            int[][] array = solution(N);
            int count = scanner.nextInt();
            for(int j = 0; j < count; j++){
                System.out.println(array[scanner.nextInt()][scanner.nextInt()]);
            }
        }
    }
}
