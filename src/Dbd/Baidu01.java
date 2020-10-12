package Baidu;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 5
 01212

 3
 */
public class Baidu01 {

    static int minStep = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        minStep=n-1;
        String s = scanner.next();
        char[] nums = s.toCharArray();
        int[] lastNum = new int[10];
        for(int i=0;i<n;i++){
            int temp = s.charAt(i)-'0';
            lastNum[temp] = i;
        }
        bfs(nums,lastNum,0, 0);
        System.out.println(minStep);

    }

    public static void bfs(char[] nums, int[] lastNum, int index, int step){
        if(step>=minStep) return;
        if(index==nums.length-1){
            minStep = step;
        }
        int curr = nums[index]-'0';
        if(lastNum[curr]<=index){
            bfs(nums,lastNum,index+1, step+1);
            return;
        }
        bfs(nums,lastNum,lastNum[curr], step+1);
        bfs(nums,lastNum,index+1, step+1);
    }
}
